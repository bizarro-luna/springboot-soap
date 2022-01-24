package com.microservicios.springboot.soap.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.microservicios.springboot.soap.dto.Producto;

@WebService
public interface ProductoService {
	
	@WebMethod
	List<Producto> getAllProducts();

	@WebMethod
	Producto getProduct(@WebParam(name = "idProducto") int idProducto);

}
