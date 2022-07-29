package Service;

import Domain.Palabra;

import java.util.HashSet;
import java.util.Set;

public class Diccionario {
    //private HashSet diccionario;
    // private Set <Palabra> palabras = new HashSet; pero no es recomendable
    private Set <Palabra> palabras;
    private String idioma;

    //el HashSet va en el constructor para que cuando se instancia una palabra siempre se use
    public Diccionario(String idioma) {
        this.idioma = idioma;
        this.palabras = new HashSet<>();
    }

    public String getIdioma() {

        return idioma;
    }



    public void ingresarPalabra(Palabra palabraAIngresar) {

        palabras.add(palabraAIngresar);
    }

    public void buscarPalabra(String palabra) {
            //ponemos el tipo de objeto que obtenemos, que recorremos : Palabra
            //le definimos un nombre : palabraEnDiccionario
            //luego de los 2 puntos, ponemos la colección que recorremos
            boolean seEncontro = false;
            for (Palabra palabraEnDiccionario : palabras) {
                if (palabraEnDiccionario.getPalabra().equals(palabra)) {
                    System.out.println(palabraEnDiccionario);
                    seEncontro = true;
                    break;
                }

            }
            if (!seEncontro) {
                System.out.println("La palabra " + palabra + " no existe en el diccionario");
            }
        
        }

    public void removerPalabra (String palabraARemover) {
        boolean seEncontro = false;
        for (Palabra palabraEnDiccionario : palabras) {
            if (palabraEnDiccionario.getPalabra().equals(palabraARemover)) {
                seEncontro = true;
                palabras.remove(palabraEnDiccionario);
                System.out.println("Se removio la palabra: " + palabraARemover);
                break;
            //Palabra palabraARemover = new Palabra(palabra);
            //boolean seRemovio = palabras.remove(palabraARemover);
            //if (seRemovio) {
                //System.out.printl("Palabra " + palabra + " removida del diccionario");
                // }else {
                    //System.out.printl("La palabra " + palabra " + palabra + " no existe en el diccionario.");
            }
        }
        if (!seEncontro) {
            System.out.println("La palabra " + palabraARemover + " no se encuentra en el diccionario.");
        }
    }
    public void imprimirPalabras() {
        for (Palabra auxiliar : palabras) {
            System.out.println(auxiliar.getPalabra());
        }
        
    }
}
