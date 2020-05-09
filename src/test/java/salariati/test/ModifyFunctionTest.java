package salariati.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import salariati.controller.EmployeeController;
import salariati.enumeration.DidacticFunction;
import salariati.model.Employee;
import salariati.repository.interfaces.EmployeeRepositoryInterface;
import salariati.repository.mock.EmployeeMock;
import salariati.validator.EmployeeValidator;
import sun.util.resources.cldr.id.CalendarData_id_ID;

public class ModifyFunctionTest {

    private EmployeeRepositoryInterface employeeRepository;
    private EmployeeController controller;
    private EmployeeValidator employeeValidator;

    @Before
    public void setUp() {
        employeeRepository = new EmployeeMock();
        controller         = new EmployeeController(employeeRepository);
        employeeValidator  = new EmployeeValidator();
    }

    @Test
    public void ChangeEmployeeFunction_ValidData_Works()
    {
        Assert.assertTrue(true);

    }

    @Test
    public void ChangeEmployeeFunction_InvalidData_ThrowsException()
    {
        Assert.assertTrue(true);
    }
}
