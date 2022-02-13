package com.yk.contact.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebAppInitalizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(SpringMvcConfig.class);

//		ServletRegistration.Dynamic dispatcher
//			= servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));

	}

}
