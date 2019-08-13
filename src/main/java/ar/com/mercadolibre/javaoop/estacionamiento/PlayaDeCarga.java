package ar.com.mercadolibre.javaoop.estacionamiento;

import java.util.ArrayList;

public class PlayaDeCarga {
    private ArrayList<Utilitario> vehiculosDeCarga = new ArrayList<Utilitario>();
    private ArrayList<Carga> cargas = new ArrayList<Carga>();;
    private ArrayList<Carga> cargasDespachadas = new ArrayList<Carga>();

    private PlayaDeCarga(){}

    private static PlayaDeCarga playaDeCarga = new PlayaDeCarga();

    public static PlayaDeCarga getInstance(){
        return playaDeCarga;
    }

    public void agregarCargaAPlaya(ArrayList<Carga> carga){
        cargas = carga;
    }

    public void agregarVehiculo(Utilitario utilitario){
        if(cargas.size() > 0){
            vehiculosDeCarga.add(utilitario);
        }
    }

    public void agregarCargaAVehiculo(Integer posicionCarga, Integer posicionVehiculo){
        if(vehiculosDeCarga.get(posicionVehiculo).getPesoPermitido()>=cargas.get(posicionCarga).getPeso()) {
            vehiculosDeCarga.get(posicionVehiculo).setCarga(cargas.get(posicionCarga));
            cargas.remove(posicionCarga);
        }
    }

    public void despacharVehiculo(Integer posicionVehiculo){
        cargasDespachadas.add(vehiculosDeCarga.get(posicionVehiculo).getCarga());
        vehiculosDeCarga.remove(posicionVehiculo);
    }

    public Integer cantidadCargaDespachada(){
        Integer cantidadDeCarga =0;
        for(Carga c: cargasDespachadas){
            cantidadDeCarga+=c.getPeso();
        }
        return cantidadDeCarga;
    }

    public ArrayList<Camioneta> camionetasVacias(){
        ArrayList<Camioneta> camionetasVacias = new ArrayList<Camioneta>();
        for(Utilitario u: vehiculosDeCarga){
            if (u instanceof Camioneta){
                camionetasVacias.add((Camioneta) u);
            }
        }
        return camionetasVacias;
    }


    public ArrayList<Utilitario> getVehiculosDeCarga() {
        return vehiculosDeCarga;
    }

    public ArrayList<Carga> getCargas() {
        return cargas;
    }

    public ArrayList<Carga> getCargasDespachadas() {
        return cargasDespachadas;
    }


}
