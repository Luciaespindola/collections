import Domain.Solicitud;
import Util.PrioridadSolicitudComparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*ArrayList <Employee> employees = new ArrayList<>();

        employees.add(new Employee("Lucia", 40930551, 24));
        employees.add(new Employee("Maria", 25768494, 28));
        employees.add(new Employee("José", 18765699, 40));
        employees.add(new Employee("Lorena", 34567890, 22));
        employees.add(new Employee("Romina", 33440099, 27));
        employees.add(new Employee("Florencia", 36823344, 36));

        System.out.println("La cantidad de empleados que trabajan en la compañia es: " + employees.size());
        AppCompany.reportEmployeeData(employees);
        System.out.println("Los empleados menores de 30 años son: ");
        AppCompany.getFromEmployeesLessThanThirty(employees);
        */

        /*Diccionario diccionarioEspañol = new Diccionario("Español");
        diccionarioEspañol.ingresarPalabra(new Palabra("Programación", "Acción y efecto programar", "Español"));
        diccionarioEspañol.ingresarPalabra(new Palabra("Saludo", "Acción y efecto de saludar", "Español"));
        diccionarioEspañol.ingresarPalabra(new Palabra("Abeja", "Insecto himenópero", "Español"));
        diccionarioEspañol.ingresarPalabra(new Palabra("Programación", "Acción y efecto programar", "Español"));

        diccionarioEspañol.buscarPalabra("Saludo");
        diccionarioEspañol.imprimirPalabras();
        diccionarioEspañol.removerPalabra("Abeja");
        diccionarioEspañol.removerPalabra("Manzana"); */


        /*Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregarLibro(new Libro("The Lightning Thief", "Rick Riordan", 2005));
        biblioteca1.agregarLibro(new Libro("The Two Towers", "John Ronald Reuel Tolkien", 1954));
        biblioteca1.agregarLibro(new Libro("The Outsider", "Stephen King", 2020));
        biblioteca1.agregarLibro(new Libro("The Two Towers", "John Ronald Reuel Tolkien", 1954));
        biblioteca1.agregarLibro(new Libro("The Sea of Monsters", "Rick Riordan", 2006));

        biblioteca1.etiquetarLibro();
        System.out.println("-------------");

        biblioteca1.imprimirLibros();
        System.out.println("-------------");

        System.out.println(biblioteca1.buscarLibro("The Two Towers"));
        System.out.println(biblioteca1.buscarLibro("Eclipse")); */

        /*Comparator <String> stringComparator = new StringLengthComparator();
        Queue<String> strings = new PriorityQueue<>(stringComparator);
        strings.add("Zapato");
        strings.add("Ojo");
        strings.add("Manzana");
        strings.add("Torre");
        strings.add("Abeja");
        strings.add("Dedo");

        System.out.println(strings);
        while (strings.size() > 0) {
            System.out.println(strings.remove());
        } */
        Queue<Solicitud> solicitudes = new PriorityQueue<>( new PrioridadSolicitudComparator());
        solicitudes.add(new Solicitud(5, "Brenda"));
        solicitudes.add(new Solicitud(2, "Mariana"));
        solicitudes.add(new Solicitud(0, "Lucía"));
        solicitudes.add(new Solicitud(1, "Kenny"));

        while (solicitudes.size() > 0) {
            System.out.println(solicitudes.remove());
            //si pongo poll o remove me imprime lo mismo.
        }


    }
}
