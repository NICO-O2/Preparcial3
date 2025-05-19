package co.edu.uniquindio;

public abstract class Vehiculo {
    protected String placa;
    protected int numeroDePeajesPagados;
    protected TipoVehiculo tipoVehiculo;

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.numeroDePeajesPagados = 0;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public TipoVehiculo obtenerTipoVehiculo() {
        return tipoVehiculo;
    }

    public int obtenerNumeroDePeajesPagados() {
        return numeroDePeajesPagados;
    }

    public void incrementarNumeroDePeajesPagados() {
        numeroDePeajesPagados++;
    }

    public abstract String obtenerDescripcion();
}
