package com.assanai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    static private Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(name = "/home")
    public String home() {

        LOGGER.info("welcome to home controller...");



        return "home";
    }

}
