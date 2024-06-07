package com.somospnt.dominio;

public class Bebida extends Producto{
    private Double litros;

    public Bebida(String nombre, Double litros, Double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// " + " Precio: $" + precio;
    }
}
