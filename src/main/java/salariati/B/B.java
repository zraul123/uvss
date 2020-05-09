package salariati.B;

import salariati.model.Employee;

import java.util.List;

//F02.	 afisarea salariatilor ordonati descrescator dupa salariu si crescator dupa varsta (CNP).
public class B {
    public String afisareSalariatiSalariu(List<Employee> employees) {
        StringBuilder stringBuilder = new StringBuilder();
        employees.stream().sorted((x, y) -> Integer.parseInt(x.getSalary()) - Integer.parseInt(y.getSalary())).forEach(x -> stringBuilder.append(x.getLastName() + " \n"));

        return stringBuilder.toString();
    }
}
