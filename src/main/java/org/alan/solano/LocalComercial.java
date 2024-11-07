package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase para los locales comerciales, extiende Local
class LocalComercial extends Local {
    private double valorArea = 400; // Precio por metro cuadrado
    private String centroComercial;

    // Constructor de la clase LocalComercial
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, String tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    // Calcula el precio de venta específico para un local comercial
    @Override
    public double calcularPrecioVenta() {
        return area * valorArea;
    }

    // Imprime los detalles del local comercial
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Centro Comercial: " + centroComercial);
        System.out.println("Precio de Venta: " + calcularPrecioVenta());
    }
}