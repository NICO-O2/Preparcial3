package co.edu.uniquindio;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa, TipoVehiculo.MOTO);
        this.cilindraje = cilindraje;
    }

    public int obtenerCilindraje() {
        return cilindraje;
    }

    @Override
    public String obtenerDescripcion() {
        return "Moto - Placa: " + placa + ", Cilindraje: " + cilindraje + " cc";
    }
}
