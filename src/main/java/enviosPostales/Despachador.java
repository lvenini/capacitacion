package ar.com.mercadolibre.javaoop.enviosPostales;

import java.util.ArrayList;
import java.util.List;

public class Despachador {

    private List<Envio> envios = new ArrayList<Envio>();
    private Asignador asignador;

    public Despachador(Asignador asignador){
        this.asignador = asignador;
    }

    public Envio generarEnvio(String direccion, List<Paquete> paquetes){
        Envio envio = new Envio(direccion, paquetes);
        envio.setCosto(asignador.asignarCosto(paquetes));
        envio.setVehiculo(asignador.asignarVehiculo(paquetes));
        if(envios.size()<=10){
            envio.setCosto(asignador.aplicarDescuento(envio.getCosto()));
        }
        envios.add(envio);
        return envio;
    }



}
