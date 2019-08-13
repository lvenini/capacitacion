package ar.com.mercadolibre.javaoop.enviosPostales;

import java.util.List;

public class Envio {

    private List<Paquete> paquetes;
    private String direccion;
    private Double costo;
    private Vehiculo vehiculo;

    public Envio(String direccion, List<Paquete> paquetes) {
        this.paquetes = paquetes;
        this.direccion = direccion;
    }


    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getCosto() {
        return costo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
