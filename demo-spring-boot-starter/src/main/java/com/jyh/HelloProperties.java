package com.jyh;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiangyiheng
 */
@ConfigurationProperties(prefix = "jyh.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}