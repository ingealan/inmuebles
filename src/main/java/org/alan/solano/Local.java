package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Clase para los locales, extiende Inmueble
class Local extends Inmueble {
    // Atributo específico de los locales para indicar si es interno o da a la calle
    protected String tipoLocal;

    // Constructor de la clase Local
    public Local(int identificadorInmobiliario, int area, String direccion, String tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    // Metodo para imprimir los detalles del local
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Local: " + tipoLocal);
    }
}