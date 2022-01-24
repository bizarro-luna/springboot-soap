package com.microservicios.springboot.soap.service.impl;

import javax.jws.WebService;



import com.microservicios.springboot.soap.service.DemoService;

/**
 * Implementacion del servicio
 * @author Hector
 *
 */
@WebService(serviceName = "DemoService", targetNamespace = "http://com.microservicios.springboot.soap.service", endpointInterface = "com.microservicios.springboot.soap.service.DemoService")
public class DemoServiceImpl implements DemoService {

	@Override
	public String say(String name) {
		return "Yo soy:" + name;
	}

}
