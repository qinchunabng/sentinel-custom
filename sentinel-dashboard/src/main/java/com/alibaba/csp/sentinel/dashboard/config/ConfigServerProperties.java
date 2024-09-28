package com.alibaba.csp.sentinel.dashboard.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "config.server")
public class ConfigServerProperties {

    private NacosConfig nacos = new NacosConfig();

    public NacosConfig getNacos() {
        return nacos;
    }

    public void setNacos(NacosConfig nacos) {
        this.nacos = nacos;
    }
}
