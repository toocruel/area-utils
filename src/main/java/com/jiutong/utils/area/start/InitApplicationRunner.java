package com.jiutong.utils.area.start;

import com.jiutong.utils.area.webmagic.AreaPageProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Auther sty
 * @createTime 2019-04-22 15:23
 */
@Component
@Order(2)
@Slf4j
public class InitApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            AreaPageProcessor.main(null);
            //
            log.info("启动爬虫");
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }
}
