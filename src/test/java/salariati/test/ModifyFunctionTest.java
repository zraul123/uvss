package salariati.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import salariati.C.C;
import salariati.enumeration.DidacticFunction;
import salariati.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ModifyFunctionTest {
    List<Employee> employees;

    @Before
    public void setUp() {
        employees = new ArrayList<>();
        Employee employee = new Employee();
        employees.add(employee);
    }

    @Test
    public void ChangeEmployeeFunction_ValidData_Works()
    {
        C b = new C();
        Employee e = employees.get(0);
        Employee a = b.modificareFunctieDidactica(employees, e, DidacticFunction.LECTURER);

        Assert.assertEquals(a.getFunction(), DidacticFunction.LECTURER);
    }

    @Test
    public void ChangeEmployeeFunction_InvalidData_ReturnsNull()
    {
        C b = new C();
        Employee e = new Employee();
        e.setSalary("232323232");
        Employee a = b.modificareFunctieDidactica(employees, e, DidacticFunction.LECTURER);

        Assert.assertNull(a);
    }
}
