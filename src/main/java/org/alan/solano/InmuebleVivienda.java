package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase base para los inmuebles de tipo vivienda
class InmuebleVivienda extends Inmueble {
    // Atributos específicos para una vivienda
    protected int numeroHabitaciones;
    protected int numeroBanos;

    // Constructor de la clase InmuebleVivienda
    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }
}