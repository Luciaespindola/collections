package Service;
import Domain.Employee;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.CertPathTrustManagerParameters;

public class AppCompany {

    //metodos del ejercicio
    public static void reportEmployeeData(ArrayList<Employee> employees) {
        //el for va hasta el tamaño de la lista: .size , pero puedo escribirlo o no
        //porque internamente el ArrayList lo hace, recorre a cada uno de los elementos
        //for (int i = 0; i < employees.size(); i++) {
          //  System.out.println(employees.get(i).toString());
        //}
        System.out.println(employees);
        }

    //public List<Employee> getFromEmployeesLessThanThirty(ArrayList<Employee> employees) {
    public static List getFromEmployeesLessThanThirty(ArrayList<Employee> employees) {
        //la variable es la edad del empleado <30
        ArrayList <Employee> variable = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() < 30) {
                variable.add(employees.get(i));
                System.out.println(employees.get(i).toString());
            }
        } return variable;
    }
    public int countEmployees(ArrayList<Employee> employees) {
        return employees.size();
    }

}
