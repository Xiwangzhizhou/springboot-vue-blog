package org.cuit.epoch;

import cn.dev33.satoken.SaManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("org.cuit.epoch.mapper")
@EnableScheduling
public class MomokaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MomokaApplication.class, args);
        System.out.println("\n启动成功：Token配置如下：" + SaManager.getConfig());
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
