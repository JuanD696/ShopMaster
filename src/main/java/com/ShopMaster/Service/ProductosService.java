package com.ShopMaster.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ShopMaster.Model.Productos;
import com.ShopMaster.Repository.ProductosRepository;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepository;

    public void guardarProducto(Productos productos) {
        productosRepository.save(productos);
    }
    public Productos obtenerProductos(String id) {
        return productosRepository.findById(id).orElse(null);
    }
    public List<Productos> obtenerTodosLosProductos(){
        return productosRepository.findAll();
    }

    public void actualizarProductos(Productos productos) {
        if (productosRepository.existsById(productos.getId())) {
            productosRepository.save(productos);
        }
    }

    public void eliminarProducto(String id) {
        productosRepository.deleteById(id);
    }
}