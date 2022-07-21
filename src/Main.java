import Service.AppCompany;
import Domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList <Employee> employees = new ArrayList<>();

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

    }
}
