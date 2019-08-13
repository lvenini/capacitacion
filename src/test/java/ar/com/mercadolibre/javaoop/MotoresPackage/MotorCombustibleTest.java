package ar.com.mercadolibre.javaoop.MotoresPackage;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorCombustibleTest {

    @Test
    public void CrearMotor(){
        MotorCombustibleTest motor = new MotorCombustibleTest();
        Assertions.assertThat(motor).isNotNull();

    }

}
