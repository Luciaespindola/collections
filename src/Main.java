import Domain.Palabra;
import Service.AppCompany;
import Domain.Employee;
import Service.Diccionario;
import java.util.ArrayList;
import java.util.List;

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

        Diccionario diccionarioEspañol = new Diccionario("Español");
        diccionarioEspañol.ingresarPalabra(new Palabra("Programación", "Acción y efecto programar", "Español"));
        diccionarioEspañol.ingresarPalabra(new Palabra("Saludo", "Acción y efecto de saludar", "Español"));
        diccionarioEspañol.ingresarPalabra(new Palabra("Abeja", "Insecto himenópero", "Español"));
        diccionarioEspañol.ingresarPalabra(new Palabra("Programación", "Acción y efecto programar", "Español"));

        diccionarioEspañol.buscarPalabra("Saludo");
        diccionarioEspañol.imprimirPalabras();
        diccionarioEspañol.removerPalabra("Abeja");
        diccionarioEspañol.removerPalabra("Manzana");

    }
}
