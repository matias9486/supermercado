package com.somospnt;

import com.somospnt.dominio.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        supermercado.agregarProductos(generarListaProductos());

        mostrarProductos(supermercado.getProductos());
        mostrarProductoMasCaro(supermercado.obtenerProductoMasCaro());
        mostrarProductoMasBarato(supermercado.obtenerProductoMasBarato());
    }

    public static List<Producto> generarListaProductos(){
        List<Producto> productos = new ArrayList<>();
        Bebida cocaZero = new Bebida("Coca-Cola Zero", 1.5, 20d);
        Bebida coca = new Bebida("Coca-Cola", 1.5, 18d);
        CuidadoPersonal shampoo = new CuidadoPersonal("Shampoo Sedal", 500, 19d);
        Fruta frutillas = new Fruta("Frutillas","Kilo", 64d);

        productos.add(cocaZero);
        productos.add(coca);
        productos.add(shampoo);
        productos.add(frutillas);
        return productos;
    }

    public static void mostrarProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("=============================");
    }
    public static void mostrarProductoMasCaro(Producto masCaro) {
        System.out.println("Producto más caro: " + masCaro.getNombre());
    }

    public static void mostrarProductoMasBarato(Producto masBarato) {
        System.out.println("Producto más barato: " + masBarato.getNombre());
    }
}