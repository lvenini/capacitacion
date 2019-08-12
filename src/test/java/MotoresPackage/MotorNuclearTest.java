package MotoresPackage;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorNuclearTest {

    @Test
    public void CrearMotor(){
        MotorNuclear motor = new MotorNuclear();
        Assertions.assertThat(motor).isNotNull();
    }

    @Test
    public void SubirPotencia(){

    }

    @Test
    public void BajarPotencia(){

    }
}
