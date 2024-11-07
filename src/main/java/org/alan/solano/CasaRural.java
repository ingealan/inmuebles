package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase para las casas rurales, extiende Casa
class CasaRural extends Casa {
    private double valorArea = 200; // Precio por metro cuadrado
    private int distanciaCabecera;
    private int altitud;

    // Constructor de la clase CasaRural
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, int distanciaCabecera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    // Calcula el precio de venta específico para una casa rural
    @Override
    public double calcularPrecioVenta() {
        return area * valorArea;
    }

    // Imprime los detalles de la casa rural
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la cabecera: " + distanciaCabecera + " km");
        System.out.println("Altitud: " + altitud + " metros");
        System.out.println("Precio de Venta: " + calcularPrecioVenta());
    }
}
