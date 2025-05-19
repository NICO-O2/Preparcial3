package co.edu.uniquindio;
import java.time.LocalDate;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected String documentoIdentidad;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, String documentoIdentidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documentoIdentidad = documentoIdentidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String obtenerNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String obtenerDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public LocalDate obtenerFechaNacimiento() {
        return fechaNacimiento;
    }
}
