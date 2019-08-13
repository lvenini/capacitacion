package ar.com.mercadolibre.javaoop.MotoresPackage;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorSolarTest {
    @Test
    public void CrearMotor()
    {
        MotorSolar motor = new MotorSolar();
        Assertions.assertThat(motor).isNotNull();
    }

    @Test
    public void SubirPotencia(){
        MotorSolar motor = new MotorSolar();
        Assertions.assertThat(motor).isNotNull();
        int potenciaAnterior = motor.getPotencia();
        motor.SubirPotencia(30);
        Assertions.assertThat(motor.getPotencia()).isGreaterThan(potenciaAnterior);
    }

    @Test
    public void BajarPotencia(){
        MotorSolar motor = new MotorSolar();
        Assertions.assertThat(motor).isNotNull();
        motor.setPotencia(50);
        int potenciaAnterior = motor.getPotencia();
        motor.BajarPotencia(30);
        Assertions.assertThat(motor.getPotencia()).isLessThan(potenciaAnterior);
    }

    @Test
    public void BajarPotenciaConRestriccionCero(){
        MotorSolar motor = new MotorSolar();
        Assertions.assertThat(motor).isNotNull();
        motor.setPotencia(0);
        motor.BajarPotencia(30);
        Assertions.assertThat(motor.getPotencia()).isGreaterThanOrEqualTo(0);
    }

    @Test
    public void SubirPotenciaYTemperatura(){
        MotorSolar motor = new MotorSolar();
        Assertions.assertThat(motor).isNotNull();
        float temperaturaAnterior = motor.getTemperatura();
        motor.SubirPotencia(30);
        Assertions.assertThat(motor.getTemperatura()).isGreaterThan(temperaturaAnterior);
    }



    @Test
    public void bajarPotenciaYTemperatura()
    {
        MotorSolar motor = new MotorSolar();
        Assertions.assertThat(motor).isNotNull();
        motor.BajarPotencia(30);
        Assertions.assertThat(motor.getTemperatura()).isGreaterThanOrEqualTo(0);
    }

}
