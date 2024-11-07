package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase para las casas urbanas, extiende Casa
class CasaUrbana extends Casa {
    // Constructor de la clase CasaUrbana
    public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }
}

// Clase para las casas en conjunto cerrado, extiende CasaUrbana
class ConjuntoCerrado extends CasaUrbana {
    private double valorArea = 350; // Precio por metro cuadrado
    private int valorAdministracion;
    private boolean tieneZonasVerdes;

    // Constructor de la clase ConjuntoCerrado
    public ConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, int valorAdministracion, boolean tieneZonasVerdes) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tieneZonasVerdes = tieneZonasVerdes;
    }

    // Calcula el precio de venta específico para una casa en conjunto cerrado
    @Override
    public double calcularPrecioVenta() {
        return area * valorArea;
    }

    // Imprime los detalles de la casa en conjunto cerrado
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor Administración: " + valorAdministracion);
        System.out.println("Tiene zonas verdes: " + (tieneZonasVerdes ? "Sí" : "No"));
        System.out.println("Precio de Venta: " + calcularPrecioVenta());
    }
}

// Clase para las casas independientes, extiende CasaUrbana
class CasaIndependiente extends CasaUrbana {
    private double valorArea = 400; // Precio por metro cuadrado

    // Constructor de la clase CasaIndependiente
    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }

    // Calcula el precio de venta específico para una casa independiente
    @Override
    public double calcularPrecioVenta() {
        return area * valorArea;
    }

    // Imprime los detalles de la casa independiente
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Precio de Venta: " + calcularPrecioVenta());
    }
}
