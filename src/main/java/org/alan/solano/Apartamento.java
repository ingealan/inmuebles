package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase para los apartamentos, extiende InmuebleVivienda
class Apartamento extends InmuebleVivienda {
    protected double valorArea;

    // Constructor de la clase Apartamento
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
    }
}

// Clase para los apartamentos familiares, extiende Apartamento
class ApartamentoFamiliar extends Apartamento {
    private int valorAdministracion;

    // Constructor de la clase ApartamentoFamiliar
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorArea = 300;
        this.valorAdministracion = 150;
    }

    // Calcula el precio de venta específico para un apartamento familiar
    @Override
    public double calcularPrecioVenta() {
        return area * valorArea;
    }

    // Imprime los detalles del apartamento familiar
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor Administración: " + valorAdministracion);
        System.out.println("Precio de Venta: " + calcularPrecioVenta());
    }
}

// Clase para los apartaestudios, extiende Apartamento
class Apartaestudio extends Apartamento {
    // Constructor de la clase Apartaestudio
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion) {
        super(identificadorInmobiliario, area, direccion, 1, 1); // Solo 1 habitación y 1 baño
        this.valorArea = 200;
    }

    // Calcula el precio de venta específico para un apartaestudio
    @Override
    public double calcularPrecioVenta() {
        return area * valorArea;
    }

    // Imprime los detalles del apartaestudio
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Precio de Venta: " + calcularPrecioVenta());
    }
}