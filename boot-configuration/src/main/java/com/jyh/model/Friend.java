package com.jyh.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author jiangyiheng
 */
@Data
@Component
@ConfigurationProperties(prefix = "friend")
public class Friend {
    private String hobby;
    private String gender;
}
