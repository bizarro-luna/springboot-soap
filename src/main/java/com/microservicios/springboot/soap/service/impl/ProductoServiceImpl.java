package com.microservicios.springboot.soap.service.impl;

import java.util.List;

import javax.jws.WebService;

import com.microservicios.springboot.soap.dto.Producto;
import com.microservicios.springboot.soap.service.ProductoService;

@WebService(endpointInterface = "com.microservicios.springboot.soap.service.ProductoService", serviceName = "productoService")
public class ProductoServiceImpl implements ProductoService {

	private Producto producto= new Producto();
	
	
	
	
	@Override
	public List<Producto> getAllProducts() {
		return producto.getAllProductos();
	}

	@Override
	public Producto getProduct(int idProducto) {
		return producto.getProducto(idProducto);
	}
	
	

}
