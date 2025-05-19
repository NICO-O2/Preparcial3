package co.edu.uniquindio;

public class Carro extends Vehiculo {
    private boolean esElectrico;
    private boolean esServicioPublico;

    public Carro(String placa, boolean esElectrico, boolean esServicioPublico) {
        super(placa, TipoVehiculo.CARRO);
        this.esElectrico = esElectrico;
        this.esServicioPublico = esServicioPublico;
    }

    public boolean esElectrico() {
        return esElectrico;
    }

    public boolean esServicioPublico() {
        return esServicioPublico;
    }

    @Override
    public String obtenerDescripcion() {
        return "Carro - Placa: " + placa + ", Eléctrico: " + esElectrico + ", Servicio Público: " + esServicioPublico;
    }
}
