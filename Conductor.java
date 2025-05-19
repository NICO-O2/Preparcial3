package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona {
    private List<Vehiculo> listaDeVehiculos;

    public Conductor(String nombre, String apellidos, String documentoIdentidad, LocalDate fechaNacimiento) {
        super(nombre, apellidos, documentoIdentidad, fechaNacimiento);
        this.listaDeVehiculos = new ArrayList<>();
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        listaDeVehiculos.add(vehiculo);
    }

    public List<Vehiculo> obtenerVehiculosPorTipo(TipoVehiculo tipoVehiculo) {
        List<Vehiculo> listaFiltrada = new ArrayList<>();
        for (Vehiculo vehiculo : listaDeVehiculos) {
            if (vehiculo.obtenerTipoVehiculo() == tipoVehiculo) {
                listaFiltrada.add(vehiculo);
            }
        }
        return listaFiltrada;
    }

    public double calcularTotalPeajes(Estacion estacion) {
        double totalRecaudado = 0;
        for (Vehiculo vehiculo : listaDeVehiculos) {
            totalRecaudado += vehiculo.obtenerNumeroDePeajesPagados() * estacion.calcularPeaje(vehiculo);
        }
        return totalRecaudado;
    }
}
