package MotoresPackage;

public class MotorSolar extends Motor {

    public MotorSolar(float temperatura, int potencia){
        super(temperatura, potencia);
    }

    public MotorSolar(){

    }

    @Override
    void SubirPotencia(int potencia) {
        this.potencia += potencia;
        this.temperatura += potencia;
    }

    @Override
    void BajarPotencia(int potencia) {
        int potenciaResultante = this.potencia - potencia;
        float temperaturaResultante = this.temperatura - potencia;

        if(potenciaResultante < 0){
            this.potencia = 0;
            this.temperatura = 0;
        }else{
            this.potencia = potenciaResultante;
            this.temperatura = temperaturaResultante;
        }

    }

}
