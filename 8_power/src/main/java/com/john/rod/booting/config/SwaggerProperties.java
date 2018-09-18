package com.john.rod.booting.config;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import springfox.documentation.service.Contact;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@Component
@ConfigurationProperties("swagger")
public class SwaggerProperties {

    private Boolean enabled = true;

    private String globalBasePackage = "";

    private String globalHost = "";

    private String globalTitle = "";

    private String globalDescription = "";

    private Contact globalContact;


    private List<DocketInfo> dockets = new ArrayList<>();

    private Authorization authorization = new Authorization();


    @Data
    @NoArgsConstructor
    public static class DocketInfo {

        private String groupName;

        private String host;

        private String title;

        private String description;

        private String basePackage;

        private Contact contact;

        private String urlPattern;

        private List<String> excludePath;

    }


    @Data
    @NoArgsConstructor
    static class Authorization {

        private String name = "Authorization";

        private String keyName = "TOKEN";

        private String type = "heard";

        private String authRegex = "^.*$";
    }


}
