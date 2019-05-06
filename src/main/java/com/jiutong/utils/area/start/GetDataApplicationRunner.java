package com.jiutong.utils.area.start;

import com.jiutong.utils.area.webmagic.AreaPageProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 15:23
 */
@Component
@Order(2)
@Slf4j
public class GetDataApplicationRunner implements ApplicationRunner {
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


    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {

            log.info("启动爬虫");
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }
}
