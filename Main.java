package co.edu.uniquindio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Estacion estacionPeaje = new Estacion("Peaje Central", "Ciudad Principal");

        Recaudador recaudador1 = new Recaudador("Carlos", "Gómez", "12345678", LocalDate.of(1985, 3, 10), 2500000);
        Recaudador recaudador2 = new Recaudador("Ana", "Martínez", "87654321", LocalDate.of(1998, 6, 15), 2600000);
        estacionPeaje.agregarRecaudador(recaudador1);
        estacionPeaje.agregarRecaudador(recaudador2);

        Conductor conductor1 = new Conductor("Luis", "Fernández", "11223344", LocalDate.of(1980, 5, 20));
        Conductor conductor2 = new Conductor("Marta", "Rodríguez", "55667788", LocalDate.of(1992, 8, 30));

        Carro carro1 = new Carro("ABC123", true, false);
        Moto moto1 = new Moto("XYZ789", 250);
        Camion camion1 = new Camion("DEF456", 4, 12);

        conductor1.asignarVehiculo(carro1);
        conductor2.asignarVehiculo(moto1);
        conductor1.asignarVehiculo(camion1);

        estacionPeaje.cobrarPeaje(carro1);
        estacionPeaje.cobrarPeaje(moto1);
        estacionPeaje.cobrarPeaje(camion1);

        estacionPeaje.imprimirReporte();

        System.out.println("Total pagado en peajes por Luis Fernández: $" + conductor1.calcularTotalPeajes(estacionPeaje));
        System.out.println("Total pagado en peajes por Marta Rodríguez: $" + conductor2.calcularTotalPeajes(estacionPeaje));

        Recaudador encontrado = estacionPeaje.buscarRecaudadorPorNombre("Carlos Gómez");
        if (encontrado != null) {
            System.out.println("Recaudador encontrado: " + encontrado.obtenerNombreCompleto() + " - Sueldo: $" + encontrado.obtenerSueldoMensual());
        } else {
            System.out.println("Recaudador no encontrado.");
        }
    }

}