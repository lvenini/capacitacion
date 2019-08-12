package JavaPackage;

public class Cerradura {

    public Integer clave;
    private boolean cerrada;

    public Cerradura(int clave){
        this.clave = clave;
        cerrada = true;
    }
    public Cerradura(){

    }

    public boolean estaCerrada(){

        return cerrada;
    }

    public void abrir(Integer clave){

        if (this.clave.equals(clave)){
            this.cerrada = false;
        }


    }
}
