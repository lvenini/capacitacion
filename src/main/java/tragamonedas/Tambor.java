package ar.com.mercadolibre.javaoop.tragamonedas;

import java.util.Random;

public class Tambor{

    private final static Integer POSICION_MAXIMA = 8;
    private final static Integer POSICION_MINIMA = 1;
    private GeneradorAleatorio generadorAleatorio;
    private int posicionActual;

    public Tambor(){
        generadorAleatorio = new GeneradorAleatorioVerdadero();
        girar();
    }

    public int obtenerPosicion(){
        return posicionActual;
    }

    public void girar(){
        posicionActual = generadorAleatorio.generarAleatorio(POSICION_MINIMA, POSICION_MAXIMA);
        System.out.print(posicionActual + " ");
    }

    public void setGeneradorAleatorio(GeneradorAleatorio generadorAleatorio){
        this.generadorAleatorio = generadorAleatorio;
    }

}
