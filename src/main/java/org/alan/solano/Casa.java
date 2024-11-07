package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase base para las casas, extiende InmuebleVivienda
class Casa extends InmuebleVivienda {
    // Atributo específico para casas: número de pisos
    protected int numeroPisos;

    // Constructor de la clase Casa
    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }
}
