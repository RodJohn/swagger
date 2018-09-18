package com.john.rod.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2  //开启swagger功能
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//整体api说明
                .groupName("user")
                .select()
                .apis(matchPattern("/user*"))
                .build();
    }

    @Bean
    public Docket createRestApi1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//整体api说明
                .groupName("dept")
                .select()
                .apis(matchPattern("/dept*"))
                .build();
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更好的API展示和测试")
                .termsOfServiceUrl("https://git.oschina.net/rod_john")
                .contact("john")
                .version("1.0")
                .build();
    }

    private Predicate<RequestHandler> matchPattern(final String pattern) {
        return new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler input) {
                return match(input.getPatternsCondition().getPatterns(), pattern);
            }
        };
    }


    private boolean match(Set<String> urls, String pattern) {
        Boolean flag = false;
        for (String url : urls) {
            if (Pattern.matches(pattern, url)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}


