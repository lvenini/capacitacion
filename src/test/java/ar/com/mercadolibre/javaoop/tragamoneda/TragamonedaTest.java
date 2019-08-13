package ar.com.mercadolibre.javaoop.tragamoneda;

import ar.com.mercadolibre.javaoop.tragamonedas.Tragamoneda;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TragamonedaTest {

    @Test
    public void testTragamoneda(){
        Tragamoneda t = new Tragamoneda();
    }

    @Test
    public void activarTragamoneda(){
        Tragamoneda t = new Tragamoneda();
        t.activar();
    }


    @Test
    public void tragamonedasEntregaPremio(){
        Tragamoneda t = new Tragamoneda();
        t.agregarTamborAPosicion(0, false);
        t.agregarTamborAPosicion(1, false);
        t.agregarTamborAPosicion(2, false);
        t.activar();
        Assertions.assertThat(t.entregaPremio()).isTrue();
    }

}
