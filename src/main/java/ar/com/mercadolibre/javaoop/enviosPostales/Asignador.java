package ar.com.mercadolibre.javaoop.enviosPostales;

import java.util.List;

public class Asignador {

    private final static double PRECIO_POR_PAQUETE = 15;
    private final static double PRECIO_CANTIDAD_MINIMA_PAQUETES = 50;
    private final static double PRECIO_CANTIDAD_MEDIANA_PAQUETES = 80;

    private final static double CANTIDAD_MINIMA_PAQUETES = 5;
    private final static double CANTIDAD_MEDIANA_PAQUETES = 10;


    public Vehiculo asignarVehiculo(List<Paquete> paquetes){
        Integer contador = paquetes.stream().mapToInt(Paquete::getPeso).sum();
        if(contador<Bicicleta.PESO_MAXIMO){
            return new Bicicleta();
        }else if(contador< ar.com.mercadolibre.javaoop.enviosPostales.Auto.PESO_MAXIMO){
            return new Auto();
        }else if(contador<Camioneta.PESO_MAXIMO){
            return new Camioneta();
        }return null;
    }

    public Double asignarCosto(List<Paquete> paquetes){
        if(paquetes.size()<CANTIDAD_MINIMA_PAQUETES){
            return PRECIO_CANTIDAD_MINIMA_PAQUETES;
        }else if(paquetes.size()<CANTIDAD_MEDIANA_PAQUETES){
            return PRECIO_CANTIDAD_MEDIANA_PAQUETES;
        }else{
            return paquetes.size()*PRECIO_POR_PAQUETE;
        }
    }

    public Double aplicarDescuento(Double costo){
        return costo * 0.9;
    }

}
