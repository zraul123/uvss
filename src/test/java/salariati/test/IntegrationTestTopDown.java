package salariati.test;

import org.junit.Assert;
import org.junit.Test;
import salariati.A.A;
import salariati.B.B;
import salariati.C.C;
import salariati.P.P;
import salariati.enumeration.DidacticFunction;
import salariati.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class IntegrationTestTopDown {

    @Test
    public void Integration_PandA_Works()
    {
        A a = new A();
        P p = new P();
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        a.addSalariat(employees, e1);

        Assert.assertTrue(p.is100(100));
        Assert.assertEquals(employees.get(0), e1);
    }

    @Test
    public void Integration_PandAandB_Works()
    {
        A a = new A();
        B b = new B();
        P p = new P();
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setLastName("Ion");
        e1.setSalary("1");
        Employee e2 = new Employee();
        e2.setLastName("Gigel");
        e2.setSalary("2000000");
        a.addSalariat(employees, e1);

        Assert.assertTrue(p.is100(100));
        Assert.assertEquals(employees.get(0), e1);
        a.addSalariat(employees, e2);
        String stringsss = b.afisareSalariatiSalariu(employees);
        Assert.assertEquals(stringsss.split("\n")[0], "Ion ");
    }

    @Test
    public void Integration_PandAandBandC_Works()
    {
        A a = new A();
        B b = new B();
        C c = new C();
        P p = new P();

        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setLastName("Ion");
        e1.setSalary("1");
        Employee e2 = new Employee();
        e2.setLastName("Gigel");
        e2.setSalary("2000000");

        Assert.assertTrue(p.is100(100));

        a.addSalariat(employees, e1);
        Assert.assertEquals(employees.get(0), e1);
        a.addSalariat(employees, e2);

        c.modificareFunctieDidactica(employees, e2, DidacticFunction.TEACHER);
        Assert.assertEquals(employees.get(1).getFunction(), DidacticFunction.TEACHER);

        String stringsss = b.afisareSalariatiSalariu(employees);
        Assert.assertEquals(stringsss.split("\n")[0], "Ion ");
    }
}
