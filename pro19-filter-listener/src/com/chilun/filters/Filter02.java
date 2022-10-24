package com.chilun.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @auther 齿轮
 * @create 2022-05-11-16:41
 */
@WebFilter("*.do")
public class Filter02 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("B");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("BB");
    }

    @Override
    public void destroy() {

    }
}
