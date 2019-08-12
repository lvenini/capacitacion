package MotoresPackage;

public abstract class Motor {

    protected float temperatura;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    protected int potencia;

    public Motor(float temperatura, int potencia)
    {
        this.temperatura = temperatura;
        this.potencia = potencia;
    }

    public Motor(){
        this.temperatura = 0;
        this.potencia = 0;
    }

    abstract void SubirPotencia(int potencia);

    abstract void BajarPotencia(int potencia);


}
