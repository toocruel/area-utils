package com.jiutong.utils.area.webmagic;

import com.jiutong.utils.area.model.EntityArea;
import com.jiutong.utils.area.service.AreaService;
import com.jiutong.utils.area.utils.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.selenium.SeleniumDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.List;

/**
 * 爬取 国家统计局 区域信息 截止到2018的
 * http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 14:58
 */
@Slf4j
public class AreaPageProcessor implements PageProcessor {
    public static String startUrl = "http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/";

    public static List<String> needCityList = new ArrayList<>();
    {

        needCityList.add("广州市");
		needCityList.add("杭州市");
        needCityList.add("济南市");
		needCityList.add("武汉市");
        needCityList.add("南宁市");
		needCityList.add("南京市");
        needCityList.add("合肥市");
		needCityList.add("长沙市");
        needCityList.add("上海市");
		needCityList.add("海口市");
        needCityList.add("安庆市");
		needCityList.add("百色市");
        needCityList.add("蚌埠市");
		needCityList.add("滨州市");
        needCityList.add("常州市");
		needCityList.add("郴州市");
        needCityList.add("池州市");
		needCityList.add("滁州市");
        needCityList.add("佛山市");
		needCityList.add("阜阳市");
        needCityList.add("贵港市");
		needCityList.add("桂林市");
        needCityList.add("菏泽市");
		needCityList.add("衡阳市");
        needCityList.add("湖州市");
		needCityList.add("淮安市");
        needCityList.add("淮北市");
		needCityList.add("淮南市");
        needCityList.add("惠州市");
		needCityList.add("济宁市");
        needCityList.add("嘉兴市");
		needCityList.add("江门市");
        needCityList.add("揭阳市");
		needCityList.add("来宾市");
        needCityList.add("莱芜市");
		needCityList.add("连云港市");
        needCityList.add("临沂市");
		needCityList.add("柳州市");
        needCityList.add("六安市");
		needCityList.add("马鞍山市");
        needCityList.add("茂名市");
		needCityList.add("梅州市");
        needCityList.add("南通市");
		needCityList.add("宁波市");
        needCityList.add("清远市");
		needCityList.add("日照市");
        needCityList.add("韶关市");
		needCityList.add("邵阳市");
        needCityList.add("绍兴市");
		needCityList.add("苏州市");
        needCityList.add("台州市");
		needCityList.add("泰州市");
        needCityList.add("铜陵市");
		needCityList.add("潍坊市");
        needCityList.add("无锡市");
		needCityList.add("芜湖市");
        needCityList.add("梧州市");
		needCityList.add("湘潭市");
        needCityList.add("宿迁市");
		needCityList.add("宿州市");
        needCityList.add("徐州市");
		needCityList.add("宣城市");
        needCityList.add("盐城市");
		needCityList.add("扬州市");
        needCityList.add("阳江市");
		needCityList.add("益阳市");
        needCityList.add("永州市");
		needCityList.add("玉林市");
        needCityList.add("岳阳市");
		needCityList.add("云浮市");
        needCityList.add("枣庄市");
		needCityList.add("湛江市");
        needCityList.add("肇庆市");
		needCityList.add("镇江市");
        needCityList.add("中山市");
		needCityList.add("珠海市");
        needCityList.add("株洲市");
		needCityList.add("金华市");
        needCityList.add("增城市");
		needCityList.add("巢湖市");
        needCityList.add("富阳市");
		needCityList.add("吴川市");
        needCityList.add("建德市");
		needCityList.add("温岭市");
        needCityList.add("赣州市");
		needCityList.add("诸暨市");
        needCityList.add("三亚市");
		needCityList.add("亳州市");
        needCityList.add("嵊州市");
		needCityList.add("余姚市");
        needCityList.add("平湖市");
		needCityList.add("滕州市");
        needCityList.add("义乌市");
		needCityList.add("章丘市");
        needCityList.add("桂平市");
		needCityList.add("永康市");
        needCityList.add("汨罗市");
		needCityList.add("高密市");
        needCityList.add("宁国市");
		needCityList.add("四会市");
        needCityList.add("开平市");
		needCityList.add("常宁市");
        needCityList.add("浏阳市");
		needCityList.add("兖州市");
        needCityList.add("恩平市");
		needCityList.add("泰兴市");
        needCityList.add("兴宁市");
		needCityList.add("青州市");
        needCityList.add("高州市");
		needCityList.add("江阴市");
        needCityList.add("安丘市");
		needCityList.add("北流市");
        needCityList.add("溧阳市");
		needCityList.add("昆山市");
        needCityList.add("太仓市");
		needCityList.add("天长市");
        needCityList.add("韶山市");
		needCityList.add("桐乡市");
        needCityList.add("信宜市");
		needCityList.add("高邮市");
        needCityList.add("寿光市");
		needCityList.add("张家港市");
        needCityList.add("启东市");
		needCityList.add("曲阜市");
        needCityList.add("阳春市");
    }

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
    public void process(Page page) {
        //
        if(page.getHtml().toString().contains("error-information-button")){
            return;
        }
        List<String> nextPageList = new ArrayList<>();
        AreaService areaService = SpringContextHolder.getBean(AreaService.class);

        //判断是否是一级省
        String url = page.getUrl().toString();
        if(url.matches(startUrl)){
            //是省直辖市列表页
            Selectable xpath = page.getHtml().xpath("//a");
            List<Selectable> all = xpath.nodes();

            for (Selectable node : all) {
		try {
                    String nextPage = node.links().get();
                    if(nextPage.contains("www.miibeian.gov.cn")){
                        continue;
                    }
                    int code  = Integer.parseInt(nextPage.substring(nextPage.lastIndexOf("/")+1,nextPage.indexOf(".html")));
                    String areaName = node.xpath("//a/text()").toString();

                    EntityArea entityArea = new EntityArea();
                    entityArea.setLevel(0);
                    entityArea.setParentCode(0);
                    entityArea.setName(areaName);
                    entityArea.setCode(code);
                    areaService.save(entityArea);
                    log.info("保存："+entityArea.toString());

                    nextPageList.add(nextPage);
                    log.info(node.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

        }

        //市
        if(url.matches(startUrl+"[0-9]+.html")){
            Selectable xpath = page.getHtml().xpath("//a");
            List<Selectable> all = xpath.nodes();

            for (Selectable node : all) {
                try {
                    String nextPage = node.links().get();
                    if(nextPage.contains("www.miibeian.gov.cn")){
                        continue;
                    }
                    if(node.xpath("//a/text()").toString().matches("[0-9]+")){
                        continue;
                    }

                    int code  = Integer.parseInt(nextPage.substring(nextPage.lastIndexOf("/")+1,nextPage.indexOf(".html")));
                    String areaName = node.xpath("//a/text()").toString();

                    if(!needCityList.contains(areaName) && !areaName.endsWith("市辖区") ){
                        continue;
                    }



                    EntityArea entityArea = new EntityArea();
                    entityArea.setLevel(1);
                    entityArea.setParentCode(Integer.parseInt((""+code).substring(0,2)));
                    entityArea.setName(areaName);
                    entityArea.setCode(code);

                    if(areaName.endsWith("市辖区")){
                        EntityArea parentArea = areaService.findByCode(entityArea.getParentCode());
                        entityArea.setName(parentArea.getName());
                    }

                    areaService.save(entityArea);
                    log.info("保存："+entityArea.toString());

//                    nextPageList.add(nextPage);
                    log.info(node.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        //区
        if(url.matches(startUrl+"[0-9]+/[0-9]+.html")){
            Selectable xpath = page.getHtml().xpath("//a");
            List<Selectable> all = xpath.nodes();

            for (Selectable node : all) {
                try {
                    String nextPage = node.links().get();
                    if(nextPage.contains("www.miibeian.gov.cn")){
                        continue;
                    }
                    if(node.xpath("//a/text()").toString().matches("[0-9]+")){
                        continue;
                    }

                    int code  = Integer.parseInt(nextPage.substring(nextPage.lastIndexOf("/")+1,nextPage.indexOf(".html")));
                    String areaName = node.xpath("//a/text()").toString();

                    if(code>310000 && code< 320000){
                        System.out.println("1");
                    }
                    EntityArea entityArea = new EntityArea();
                    entityArea.setLevel(2);
                    entityArea.setParentCode(Integer.parseInt((""+code).substring(0,4)));
                    entityArea.setName(areaName);
                    entityArea.setCode(code);
                    areaService.save(entityArea);
                    log.info("保存："+entityArea.toString());

//                    nextPageList.add(nextPage);
                    log.info(node.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
//
//        //街道
        if(url.matches(startUrl+"[0-9]+/[0-9]+/[0-9]+.html")){
            Selectable xpath = page.getHtml().xpath("//a");
            List<Selectable> all = xpath.nodes();

            for (Selectable node : all) {
                try {
                    String nextPage = node.links().get();
                    if(nextPage.contains("www.miibeian.gov.cn")){
                        continue;
                    }
                    if(node.xpath("//a/text()").toString().matches("[0-9]+")){
                        continue;
                    }

                    int code  = Integer.parseInt(nextPage.substring(nextPage.lastIndexOf("/")+1,nextPage.indexOf(".html")));

                    String areaName = node.xpath("//a/text()").toString();

                    EntityArea entityArea = new EntityArea();
                    entityArea.setLevel(3);
                    entityArea.setParentCode(Integer.parseInt((""+code).substring(0,6)));
                    entityArea.setName(areaName);
                    entityArea.setCode(code);
                    areaService.save(entityArea);
                    log.info("保存："+entityArea.toString());

//                    nextPageList.add(nextPage);
                    log.info(node.toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }



        // 部分三：从页面发现后续的url地址来抓取
        page.addTargetRequests(nextPageList);
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {

        AreaService areaService = SpringContextHolder.getBean(AreaService.class);

        //省份
        List<EntityArea>  provinces = areaService.findByLevel(0);
        List<EntityArea>  citys = areaService.findByLevel(1);
        List<EntityArea>  areas = areaService.findByLevel(2);


        System.getProperties().setProperty("webdriver.chrome.driver", "/Users/sty/Downloads/chromedriver");
        SeleniumDownloader downloader = new SeleniumDownloader("/Users/sty/Downloads/chromedriver");

        Spider spider = Spider.create(new AreaPageProcessor())
                .addPipeline(new AreaPipeline())
                .thread(1)
                .setDownloader(downloader);
//                .setDownloader(new AreaDownloader())

        //抓取市
        for (EntityArea province : provinces) {
            spider.addUrl(startUrl+province.getCode()+".html");
        }


        //抓取区县
//        Collections.reverse(citys);
//        for (EntityArea city : citys) {
//            spider.addUrl(startUrl+city.getParentCode()+"/"+city.getCode()+".html");
//        }

        //抓取街道
//        for (EntityArea area : areas) {
//            String code = area.getCode()+"";
//            spider.addUrl(startUrl+code.substring(0,2)+"/"+code.substring(2,4)+"/"+code+".html");
//        }


        spider.run();


    }
}
