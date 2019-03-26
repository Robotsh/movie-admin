package com.robot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class BasePathInterceptor implements Filter {

    private static Logger logger = LoggerFactory.getLogger(BasePathInterceptor.class);

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest request = (HttpServletRequest)servletRequest;
        String prjPath = request.getScheme() + "://" + request.getServerName() + (request.getServerPort() == 80 ? "" : ":" + request.getServerPort()) + request.getContextPath();
        request.setAttribute("basePath", prjPath);
        filterChain.doFilter(servletRequest, servletResponse);

    }

    public void destroy() {

    }



}