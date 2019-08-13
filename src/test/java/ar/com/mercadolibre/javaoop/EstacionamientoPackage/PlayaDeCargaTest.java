package ar.com.mercadolibre.javaoop.EstacionamientoPackage;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PlayaDeCargaTest {
    @Test
    public void nuevaPlaya() {
        PlayaDeCarga playa = PlayaDeCarga.abrirPlayaDeCarga();
        Assertions.assertThat(playa).isNotNull();
    }

    @Test
    public void nuevaPlayaConUnaPlayaExistente() {
        PlayaDeCarga playa = PlayaDeCarga.abrirPlayaDeCarga();
        PlayaDeCarga playa2 = PlayaDeCarga.abrirPlayaDeCarga();

        Assertions.assertThat(playa).isEqualTo(playa2);
    }

    @Test
    public void nuevaPlayaConColeccionVacia(){
        PlayaDeCarga playa = PlayaDeCarga.abrirPlayaDeCarga();
        Assertions.assertThat(playa.getVehiculosDeCarga()).isNotNull();
    }

}
