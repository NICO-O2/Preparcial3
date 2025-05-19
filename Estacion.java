package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String nombre;
    private String ubicacion;
    private double totalRecaudado;
    private List<Vehiculo> listaDeVehiculosRegistrados;
    private List<Recaudador> listaDeRecaudadores;

    public Estacion(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalRecaudado = 0;
        this.listaDeVehiculosRegistrados = new ArrayList<>();
        this.listaDeRecaudadores = new ArrayList<>();
    }
    public double calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            Carro carro = (Carro) vehiculo;
            double base = 10000;
            if (carro.esElectrico()) base *= 0.8;
            if (carro.esServicioPublico()) base *= 1.15;
            return base;
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            return (moto.obtenerCilindraje() > 200) ? 7000 : 5000;
        } else if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            double base = camion.obtenerNumeroDeEjes() * 7000;
            if (camion.obtenerCapacidadDeCarga() > 10) base *= 1.10;
            return base;
        }
        return 0;  // Si no es un tipo de vehículo válido, retorna 0
    }


    public void agregarRecaudador(Recaudador recaudador) {
        listaDeRecaudadores.add(recaudador);
    }

    public Recaudador buscarRecaudadorPorNombre(String nombreCompleto) {
        for (Recaudador recaudador : listaDeRecaudadores) {
            if (recaudador.obtenerNombreCompleto().equalsIgnoreCase(nombreCompleto.trim())) {
                return recaudador;
            }
        }
        return null;
    }

    public void cobrarPeaje(Vehiculo vehiculo) {
        double montoPeaje = calcularPeaje(vehiculo);
        totalRecaudado += montoPeaje;
        listaDeVehiculosRegistrados.add(vehiculo);
        vehiculo.incrementarNumeroDePeajesPagados();
    }
    public void imprimirReporte() {
        System.out.println("Estación: " + nombre + " - Ubicación: " + ubicacion);
        System.out.println("Total recaudado: $" + totalRecaudado);
        for (Vehiculo vehiculo : listaDeVehiculosRegistrados) {
            System.out.println(vehiculo.obtenerDescripcion() + " - Peaje: $" + calcularPeaje(vehiculo));
        }
    }

}
