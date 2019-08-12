package ar.com.mercadolibre.javaoop.estacionamiento;

import java.util.ArrayList;

public class PlayaDeEstacionamiento {
    ArrayList<Vehiculo> vehiculosDeEstacionamiento = new ArrayList<Vehiculo>();

    private PlayaDeEstacionamiento(){}

    private static PlayaDeEstacionamiento playaDeEstacionamiento = new PlayaDeEstacionamiento();

    public static PlayaDeEstacionamiento getInstance(){
        return playaDeEstacionamiento;
    }

    public void agregarVehiculo(Vehiculo v){
        vehiculosDeEstacionamiento.add(v);
    }

}
