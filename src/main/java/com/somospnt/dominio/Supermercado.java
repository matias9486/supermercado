package com.somospnt.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermercado {
    private List<Producto> productos;

    public Supermercado() {
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    public void agregarProductos(List<Producto> productos){
        this.productos.addAll(productos);
    }
    public Producto obtenerProductoMasCaro() {
        return Collections.max(productos);
    }

    public Producto obtenerProductoMasBarato() {
        return Collections.min(productos);
    }
}
