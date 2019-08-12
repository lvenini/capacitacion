package libreria;

import java.time.LocalDateTime;

public class Alquiler {

    private Libro libro;
    private LocalDateTime fechaDevolucion;
    private LocalDateTime fechaAlquiler;


    public Libro getLibro() {
        return libro;
    }
}
