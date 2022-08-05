package Service;

import Domain.Libro;
import Domain.Libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int consec;
    private List<Libro> libros;

    public Biblioteca() {
        //para que se instancien los libros desde el ArrayList, si no
        //nos quedaria nulo.
        this.consec = 0;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libroAIngresar) {
        //a la coleccion de libros le agrego el libro que
        //recibimos como parametro
        libros.add(libroAIngresar);
    }

    public void etiquetarLibro() {
        for (int i = 0; i < libros.size(); i++) {
            //si en la coleccion del libros en la casilla a la que voy
            if (libros.get(i).getCodigo() == null) {
                libros.get(i).setCodigo(libros.get(i).getTitulo() + "/" + libros.get(i).getAño() + "/" + consec);
                consec++;
            }
        }
        // puedo  hacer un forech en vez del for común
        for (Libro libro: libros) {
            if (libro.getCodigo() == null) {
                libro.setCodigo(libro.getTitulo() + "/" + libro.getAño() +
                        "/" + consec);
            }

        }
    }

    public List<Libro> buscarLibro(String tituloABuscar) {
        List<Libro> auxiliar = new ArrayList<>();
        //creamos lista auxiliar para devolver libros con titulo igual al titulo buscado
        for (int i = 0; i < libros.size(); i++) { //recorrer lista para buscar el titulo entre todos los libros
            if (libros.get(i).getTitulo().equals(tituloABuscar) == true) { //si el titulo buscado corresponde al titulo del libro
                auxiliar.add(libros.get(i)); //agrego el libro a la lista auxiliar para devolver el resultado de la busqueda

            }

        }
        return auxiliar; //devuelvo la lista de libros con ese titulo
    }

    public void imprimirLibros() {
        //System.out.println(Libros);
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).getTitulo() + "/" + libros.get(i).getAutor() +
                    "/" + libros.get(i).getAño() + "/" + libros.get(i).getCodigo());
        }
    }
}