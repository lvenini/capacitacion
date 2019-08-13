package ar.com.mercadolibre.javaoop.libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Libreria {

    private Libreria(){}

    private static Libreria libreria = new Libreria();
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();


    public static Libreria getInstance(){
        return libreria;
    }



    public void registrarAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
    }


    public Alquiler buscarAlquileresPorTituloDeLibro(String titulo) throws NullPointerException{
         Predicate<Alquiler> librosConTitulo = alquiler -> alquiler.getLibro().getTitulo().equals(titulo);
         Optional<Alquiler> optional = alquileres.stream().filter(librosConTitulo).findFirst();
         if(optional.get()!=null){
             return optional.get();
         } else throw new NullPointerException();
    }


}
