package ar.com.mercadolibre.javaoop.EstacionamientoPackage;

import java.util.ArrayList;

public class PlayaDeCarga {

    private ArrayList<Utilitario> vehiculosDeCarga;
    private static PlayaDeCarga unico;

    private PlayaDeCarga(){
        vehiculosDeCarga = new ArrayList<Utilitario>();
    }

    public static PlayaDeCarga abrirPlayaDeCarga(){
        if (unico == null){
            unico = new PlayaDeCarga();
        }
        return unico;
    }

    public ArrayList<Utilitario> getVehiculosDeCarga() {
        return vehiculosDeCarga;
    }
}
