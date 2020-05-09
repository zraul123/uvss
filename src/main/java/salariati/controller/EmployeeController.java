package salariati.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import salariati.enumeration.DidacticFunction;
import salariati.model.Employee;
import salariati.repository.interfaces.EmployeeRepositoryInterface;

public class EmployeeController {
	
	private EmployeeRepositoryInterface employeeRepository;
	
	public EmployeeController(EmployeeRepositoryInterface employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.addEmployee(employee);
	}
	
	public List<Employee> getEmployeesList() {
		return employeeRepository.getEmployeeList();
	}
	
	public void modifyEmployee(Employee oldEmployee, Employee newEmployee) {
		employeeRepository.modifyEmployee(oldEmployee, newEmployee);
	}

	public void deleteEmployee(Employee employee) {
		employeeRepository.deleteEmployee(employee);
	}

	public List<Employee> getEmployeesByLastName(String searchedLastName){
		List<Employee> employeeList = employeeRepository.getEmployeeList();
		List<Employee> returnedEmployeeList = new ArrayList<Employee>();
		Pattern lastEmployeePattern = Pattern.compile("^[A-Z][a-z]+$");
		Matcher matcher = lastEmployeePattern.matcher(searchedLastName);
		if(!matcher.matches())
		{
			return new ArrayList<Employee>();
		}

		for (Employee employee : employeeList)
		{
			if(employee.getLastName().equals(searchedLastName))
			{
				returnedEmployeeList.add(employee);
			}
		}
		return returnedEmployeeList;
	}

	public void modifyFunction(final Employee employee, DidacticFunction lecturer) {
		List<Employee> a = employeeRepository.getEmployeeList().stream().filter(x -> x == employee).collect(Collectors.toList());
        if (a.size() > 1) {
            Employee foundEmplyee = a.get(0);
            foundEmplyee.setFunction(lecturer);
        }

	}
}
