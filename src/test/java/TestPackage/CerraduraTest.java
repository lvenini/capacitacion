package TestPackage;


import JavaPackage.Cerradura;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CerraduraTest {
    @Test
    public void crearCerradura()
    {
         Cerradura cerradura = new Cerradura();
         Assertions.assertThat(cerradura).isNotNull();

    }

    @Test
    public void crearCerraduraConClaveNumerica(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
    }
    @Test
    public void crearCerraduraConClaveNumericaYLaGuardo()
    {
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1234);
    }

    @Test
    public void unaCerraduraSeCreaCerrada()
    {
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
    }

    @Test
    public void abrirCerradura()
    {
        //Crear una cerradura
        Cerradura cerradura = new Cerradura(1235);
        //Veo que este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
        //La intento abrir
        cerradura.abrir(1235);
        //Ver que esta cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isFalse();

    }

    @Test
    public void abrirCerraduraConClaveIncorrrecta()
    {
        //Crear una cerradura
        Cerradura cerradura = new Cerradura(1235);
        //Veo que este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
        //La intento abrir
        cerradura.abrir(1234);
        //Ver que esta cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();

    }
}
