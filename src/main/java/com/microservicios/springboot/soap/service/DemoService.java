package com.microservicios.springboot.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Interfaces de los servicios a desplegar
 * @author Hector
 *
 */
@WebService(name="DemoService",targetNamespace = "http://com.microservicios.springboot.soap.service")
public interface DemoService {
    
	
	
	/**
	 * Metodo que recibe un nombre
	 * @param nombre
	 * @return
	 */
	@WebMethod
    String say(@WebParam(name = "nombre") String nombre);
}