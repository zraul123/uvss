package salariati.A;

import salariati.model.Employee;

import java.util.List;

//F01.	 adaugarea unui nou angajat (nume, prenume, CNP, functia didactica, salariul de incadrare);
//F03.	 afisarea salariatilor ordonati descrescator dupa salariu si crescator dupa varsta (CNP).
public class A {
    public List<Employee> addSalariat(List<Employee> employeeList, Employee newEmployee) {
        employeeList.add(newEmployee);
        return employeeList;
    }
}
