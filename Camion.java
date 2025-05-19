package co.edu.uniquindio;

public class Camion extends Vehiculo {
    private int numeroDeEjes;
    private double capacidadDeCarga;

    public Camion(String placa, int numeroDeEjes, double capacidadDeCarga) {
        super(placa, TipoVehiculo.CAMION);
        this.numeroDeEjes = numeroDeEjes;
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int obtenerNumeroDeEjes() {
        return numeroDeEjes;
    }

    public double obtenerCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    @Override
    public String obtenerDescripcion() {
        return "Camión - Placa: " + placa + ", Ejes: " + numeroDeEjes + ", Carga: " + capacidadDeCarga + " toneladas";
    }
}
