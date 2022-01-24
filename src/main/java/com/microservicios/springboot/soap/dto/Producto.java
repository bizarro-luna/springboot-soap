package com.microservicios.springboot.soap.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * Entidad de Productoo
 * @author Hector
 *
 */
public class Producto implements Serializable {

//	private final Logger log = LoggerFactory.getLogger(Producto.class);
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nombre;
	
	private String categoria;

	public Producto(Integer id, String nombre, String categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	
	List<Producto> productoList = new ArrayList<Producto>();

	public Producto() {
		Producto p1 = new Producto(101, "Laptop", "Electronics");
		Producto p2 = new Producto(102, "Bannana", "Fruits");
		Producto p3 = new Producto(103, "Pencil", "Stationary");
		productoList.add(p1);
		productoList.add(p2);
		productoList.add(p3);
	}

	public Producto getProducto(int id) {
		return productoList.stream().filter(p->p.getId().intValue()==id).findFirst().orElse(null);
	}

	public List<Producto> getAllProductos() {
		return productoList;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
