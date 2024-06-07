package com.somospnt.dominio;

public class CuidadoPersonal extends Producto{
    private Integer contenido;

    public CuidadoPersonal(String nombre, Integer contenido, Double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " ///  Contenido: " + contenido + "ml ///  Precio: $" + precio;
    }
}
