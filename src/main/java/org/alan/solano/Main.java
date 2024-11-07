package org.alan.solano;
//Nombre:Alan Solano
//Fecha:06/11/2024
//Detalle:Main del programa
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las diferentes clases

        // Casas rurales
        CasaRural casaRural = new CasaRural(1, 150, "Ruta 10, Km 20", 3, 2, 2, 50, 1200);
        casaRural.imprimir();
        System.out.println();

        // Casas urbanas (Conjunto Cerrado)
        ConjuntoCerrado casaConjuntoCerrado = new ConjuntoCerrado(2, 120, "Calle 5 # 23-45", 4, 3, 2, 250, true);
        casaConjuntoCerrado.imprimir();
        System.out.println();

        // Casas urbanas (Independientes)
        CasaIndependiente casaIndependiente = new CasaIndependiente(3, 200, "Calle 6 # 34-56", 5, 4, 3);
        casaIndependiente.imprimir();
        System.out.println();

        // Apartamentos familiares
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(4, 80, "Avenida 9 # 45-67", 3, 2);
        apartamentoFamiliar.imprimir();
        System.out.println();

        // Apartaestudios
        Apartaestudio apartaestudio = new Apartaestudio(5, 40, "Carrera 10 # 89-01");
        apartaestudio.imprimir();
        System.out.println();

        // Local comercial
        LocalComercial localComercial = new LocalComercial(6, 100, "Centro Comercial Plaza", "Exterior", "Centro Comercial Plaza Norte");
        localComercial.imprimir();
        System.out.println();

        // Oficina
        Oficina oficina = new Oficina(7, 80, "Edificio Central, Piso 5", "Interior", true);
        oficina.imprimir();
        System.out.println();
    }
}


