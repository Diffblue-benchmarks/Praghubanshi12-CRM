/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.crm1;

import com.cibt.crm1.configure.AppConfiguration;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author user
 */
public class AppStarter implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        AnnotationConfigWebApplicationContext ctx =
                new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfiguration.class);
        
        ServletRegistration.Dynamic dispatcher=
                sc.addServlet("dispatcher", new DispatcherServlet(ctx));
        
        
        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);
    }
    
    
}
