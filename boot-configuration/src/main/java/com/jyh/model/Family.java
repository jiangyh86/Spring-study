package com.jyh.model;

        import lombok.Data;
        import org.hibernate.validator.constraints.Length;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.boot.context.properties.ConfigurationProperties;
        import org.springframework.context.annotation.PropertySource;
        import org.springframework.stereotype.Component;
        import org.springframework.validation.annotation.Validated;

/**
 * @author jiangyiheng
 */
//@Data
//@Component
//@ConfigurationProperties(prefix = "family")
//@Validated
//@PropertySource(value = {"classpath:family.yml"},factory = com.jyh.util.MixPropertiesSourceFactory.class)//value = "family.properties"
public class Family {
    @Value("${family.family-name}")
    @Length(min = 5,max = 20 ,message = "长度在5-20之间")
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;
}
