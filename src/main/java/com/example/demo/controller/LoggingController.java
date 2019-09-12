package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
@Log4j2
public class LoggingController {

    @RequestMapping("/")
    public String index() {
        // log.trace("A TRACE Message");
        // log.debug("A DEBUG Message");
        // log.info("An INFO Message");
        // log.warn("A WARN Message");
        // log.error("An ERROR Message");
        ThreadContext.put("transactionId", "192168219");
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        // log.info("{\"hello\": \"world\"}");
        log.info(map);
        ThreadContext.clearMap();
        return "Howdy! Check out the Logs to see the output...";
    }
}
