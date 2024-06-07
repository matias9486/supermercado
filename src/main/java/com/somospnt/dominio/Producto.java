package com.somospnt.dominio;

public abstract class Producto implements Comparable<Producto>{
    protected String nombre;
    protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        //return Double.compare(this.precio, o.getPrecio());
        return (int) (this.precio - o.getPrecio());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// " + " precio: $" + precio;
    }
}
