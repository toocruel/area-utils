package com.jiutong.utils.area.webmagic;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.downloader.Downloader;
import us.codecraft.webmagic.downloader.HttpClientDownloader;

/**
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 15:46
 */
public class AreaDownloader extends HttpClientDownloader implements Downloader {


    @Override
    public Page download(Request request, Task task) {
        request.addHeader("Cookie","__guid=114041473.1781210994388745200.1533284433697.5437; wzwsconfirm=0da2a6860c10d7c4ed6204aa5e2ef3d0; monitor_count=7; wzwstemplate=NQ==; ccpassport=ab4dfc243d0c06e9bcd43a4d50aa4883; wzwschallenge=-1; wzwsvtime=1533310126");
        request.addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
        request.addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");

        return super.download(request,task);
    }

    @Override
    public void setThread(int threadNum) {

    }
}
