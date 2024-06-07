package com.somospnt.dominio;

public class Fruta extends Producto{
    private String unidadVenta;

    public Fruta(String nombre, String unidadVenta, Double precio ) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " ///  Precio: $" + precio + " /// Unidad de Venta: " + unidadVenta;
    }
}
