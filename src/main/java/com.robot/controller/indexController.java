package com.robot.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/admin")
public class indexController {

    protected Logger logger = LoggerFactory.getLogger(indexController.class);

    @RequestMapping(value = "/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("aa", "123");
        logger.info("admin:{}",123);
        return mv;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView mv = new ModelAndView("/admin/login");
        mv.addObject("aa", "123");

        try {
            int a=1/0;
        } catch (Exception e) {
            logger.error("admin:{}",123,e);
        }
        logger.info("admin:{}",123);
        return mv;
    }
}
