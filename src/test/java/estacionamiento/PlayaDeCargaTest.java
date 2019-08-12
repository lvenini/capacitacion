package ar.com.mercadolibre.javaoop.estacionamiento;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlayaDeCargaTest {

    @Test
    public void singletonPlayaDeCarga(){
        PlayaDeCarga playaDeCarga = PlayaDeCarga.getInstance();
        PlayaDeCarga playaDeCarga2 = PlayaDeCarga.getInstance();
        Assertions.assertThat(playaDeCarga).isEqualTo(playaDeCarga2);
    }

    @Test
    public void listasVehiculosDeCargaNoNulas(){
        PlayaDeCarga playaDeCarga = PlayaDeCarga.getInstance();
        Assertions.assertThat(playaDeCarga.getVehiculosDeCarga()).isNotNull();
    }

    @Test
    public void listaCargasNoNulas(){
        PlayaDeCarga playaDeCarga = PlayaDeCarga.getInstance();
        Assertions.assertThat(playaDeCarga.getCargas()).isNotNull();
    }

    @Test
    public void listasCargasDespachadasNoNulas(){
        PlayaDeCarga playaDeCarga = PlayaDeCarga.getInstance();
        Assertions.assertThat(playaDeCarga.getCargasDespachadas()).isNotNull();
    }

    @Test
    public void agregarListaDeCargas(){
        ArrayList<Carga> cargas = new ArrayList<Carga>();
        cargas.add(new Carga(100));
        cargas.add(new Carga(200));
        PlayaDeCarga.getInstance().agregarCargaAPlaya(cargas);
        Assertions.assertThat(PlayaDeCarga.getInstance().getCargas().size()).isGreaterThan(0);

    }

}
