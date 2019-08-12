package ar.com.mercadolibre.javaoop.tragamonedas;

import java.util.Random;

public class GeneradorAleatorioVerdadero extends GeneradorAleatorio {

    @Override
    public int generarAleatorio(int numeroMinimo, int numeroMaximo) {
        Random r = new Random();
        return r.nextInt((numeroMaximo-numeroMinimo)+1)+numeroMinimo;
    }
}
