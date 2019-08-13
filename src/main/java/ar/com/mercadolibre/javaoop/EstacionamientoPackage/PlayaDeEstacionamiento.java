package ar.com.mercadolibre.javaoop.EstacionamientoPackage;

import java.util.ArrayList;

public class PlayaDeEstacionamiento {

    private ArrayList<Vehiculo> Vehiculos;
    private static PlayaDeEstacionamiento unico;

    private PlayaDeEstacionamiento(){}

    public static PlayaDeEstacionamiento abrirPlayaEstaciomiento(){
        if(unico == null){
            unico = new PlayaDeEstacionamiento();

        }
        return unico;
    }


}
