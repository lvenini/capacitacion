package ar.com.mercadolibre.javaoop.estacionamiento;

public abstract class Utilitario extends Vehiculo {

    private Integer pesoPermitido;
    private Carga carga;

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Integer getPesoPermitido() {
        return pesoPermitido;
    }
}
