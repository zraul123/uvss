package salariati.C;

import salariati.enumeration.DidacticFunction;
import salariati.model.Employee;

import java.util.List;

//F03.	 modificarea functiei didactice (asistent/lector/conferentiar/profesor) a unui angajat;
public class C {
    public Employee modificareFunctieDidactica(List<Employee> employeeList, Employee e, DidacticFunction f) {
        if (employeeList.stream().anyMatch(x -> e == x)) {
            e.setFunction(f);
            return e;
        }
        return null;
    }
}
