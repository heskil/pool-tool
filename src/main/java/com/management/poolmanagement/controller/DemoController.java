package com.management.poolmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
class DemoController {

    @RequestMapping("/demo")
    public ModelAndView getDemoPage() {
        ModelAndView modelAndView = new ModelAndView("/demo");
        return modelAndView;
    }

}
