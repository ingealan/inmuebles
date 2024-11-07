package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
// Detalle: Clase base para todos los tipos de inmuebles
class Inmueble {
    // Atributos básicos para un inmueble
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    // Constructor de la clase Inmueble
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    // Metodo para calcular el precio de venta del inmueble
    public double calcularPrecioVenta() {
        return 0; // Este método será sobreescrito en las subclases
    }

    // Metodo para imprimir los detalles del inmueble
    public void imprimir() {
        System.out.println("ID: " + identificadorInmobiliario);
        System.out.println("Área: " + area + " metros cuadrados");
        System.out.println("Dirección: " + direccion);
    }
}