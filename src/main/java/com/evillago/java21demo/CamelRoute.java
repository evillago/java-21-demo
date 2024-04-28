package com.evillago.java21demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:foo?fixedRate=true&period=10000")
                .to("metrics:counter:mytimer")
                .log("hello");
    }
}
