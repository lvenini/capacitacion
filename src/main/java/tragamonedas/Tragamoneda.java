package ar.com.mercadolibre.javaoop.tragamonedas;

public class Tragamoneda {

    private Tambor[] tambores = new Tambor[3];

    public Tragamoneda(){ }

    public void activar(){
        for (int x=0; x<tambores.length; x++){
            tambores[x].girar();
        }
        entregaPremio();
    }

    public void agregarTamborAPosicion(int posicion, boolean tambor){
        Tambor t = new Tambor();
        if(posicion>=0 && posicion <=2){
            if(tambor){
                t.setGeneradorAleatorio(new GeneradorAleatorioVerdadero());
            }else{
                t.setGeneradorAleatorio(new GeneradorAleatorioFalso());
            }
            tambores[posicion] = t;
        }
    }

    public boolean entregaPremio(){
        boolean mismoNro = true;
        int numero = 0;
        for (int x=0; x<tambores.length; x++) {
            if (x == 0) {
                numero = tambores[x].obtenerPosicion();
            } else {
                if (numero != tambores[x].obtenerPosicion()) {
                    mismoNro = false;
                }
            }
        }
        return mismoNro;
    }

}
