package ar.com.mercadolibre.javaoop.postales;

import ar.com.mercadolibre.javaoop.enviosPostales.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DespachadorTest {
    @Mock Asignador asignadorMock;


    @Test
    public void alDespacharDeberiaAsignarElCostoConDescuentoAlEnvioQueCalculaElAsignadorDeCosto(){
        List<Paquete> paquetes = new ArrayList<Paquete>();

        Despachador despachador = new Despachador(asignadorMock);

        when(asignadorMock.asignarCosto(paquetes)).thenReturn(100.0);
        when(asignadorMock.aplicarDescuento(100.0)).thenReturn(90.0);

        Envio envio = despachador.generarEnvio("Calle falsa 123", paquetes);

        Assertions.assertThat(envio.getCosto()).isEqualTo(90.0);

    }

    @Test
    public void alDespacharDeberiaAsignarElCostoSinDescuentoAlEnvioQueCalculaElAsignadorDeCosto(){
        List<Paquete> paquetes = new ArrayList<Paquete>();

        Despachador despachador = new Despachador(asignadorMock);

        when(asignadorMock.asignarCosto(paquetes)).thenReturn(100.0);

        Envio envio = null;
        for(int i = 0 ; i < 12; i++){
            envio = despachador.generarEnvio("Calle falsa 123", paquetes);
        }

        Assertions.assertThat(envio.getCosto()).isEqualTo(100.0);

    }


    @Test
    public void alDespacharDeberiaAsignarBicicleta(){
        List<Paquete> paquetes = new ArrayList<Paquete>();

        Despachador despachador = new Despachador(asignadorMock);

        when(asignadorMock.asignarVehiculo(paquetes)).thenReturn(new Bicicleta());
        Envio envio = despachador.generarEnvio("Calle falsa 123", paquetes);

        Assertions.assertThat(envio.getVehiculo()).isInstanceOf(Bicicleta.class);

    }
}
