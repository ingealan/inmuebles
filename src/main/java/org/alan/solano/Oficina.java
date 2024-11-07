package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase para las oficinas, extiende Local
class Oficina extends Local {
    private double valorArea = 450; // Precio por metro cuadrado
    private boolean esGobierno;

    // Constructor de la clase Oficina
    public Oficina(int identificadorInmobiliario, int area, String direccion, String tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    // Calcula el precio de venta específico para una oficina
    @Override
    public double calcularPrecioVenta() {
        return area * valorArea;
    }

    // Imprime los detalles de la oficina
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es oficina de gobierno: " + (esGobierno ? "Sí" : "No"));
        System.out.println("Precio de Venta: " + calcularPrecioVenta());
    }
}