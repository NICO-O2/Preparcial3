package co.edu.uniquindio;

import java.time.LocalDate;

public class Recaudador extends Persona {
    private double sueldoMensual;

    public Recaudador(String nombre, String apellidos, String documentoIdentidad, LocalDate fechaNacimiento, double sueldoMensual) {
        super(nombre, apellidos, documentoIdentidad, fechaNacimiento);
        this.sueldoMensual = sueldoMensual;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }
}
