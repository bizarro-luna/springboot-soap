package com.microservicios.springboot.soap.config;



import javax.xml.ws.Endpoint;


import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.microservicios.springboot.soap.service.impl.DemoServiceImpl;
import com.microservicios.springboot.soap.service.impl.ProductoServiceImpl;

/**
 * Configuracion para CFX Apache
 * @author Hector
 *
 */
@Configuration
public class CxfConfig {
	
	@Autowired
    private Bus bus;
	


	
	 // Replaces web.xml
    @Bean
    public ServletRegistrationBean<CXFServlet> servletRegistrationBean() {
        ServletRegistrationBean<CXFServlet> servletRegistrationBean = new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/ws/*");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }
	
	
	// Replaces cxf-servlet.xml
    // <jaxws:endpoint id="helloWorld" implementor="demo.spring.service.HelloWorldImpl" address="/demoService"/>
    @Bean
    public Endpoint endpoint() {
    	 Object implementor = new DemoServiceImpl();
        EndpointImpl endpoint = new EndpointImpl(bus, implementor);
        endpoint.publish("/demoService");
        return endpoint;
    }
    
    @Bean
    public Endpoint productoEndpoint() {
    	Object implementor = new ProductoServiceImpl();
        EndpointImpl endpoint = new EndpointImpl(bus,implementor);
        endpoint.publish("/productoService");
        return endpoint;
    }

}
