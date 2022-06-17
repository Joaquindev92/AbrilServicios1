package com.idat.AbrilServicio1.servicio;

import java.util.List;
import java.util.Optional;

import com.idat.AbrilServicio1.dto.ProductoDTORequest;
import com.idat.AbrilServicio1.dto.ProductoDTOResponse;
import com.idat.AbrilServicio1.modelo.Productos;


public interface ProductoServicio {

	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	public void eliminarProducto(Integer id);
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId (Integer id);
}
