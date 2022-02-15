package com.example.EmployeeLab;

import com.example.EmployeeLab.models.Department;
import com.example.EmployeeLab.models.Employee;
import com.example.EmployeeLab.models.Project;
import com.example.EmployeeLab.repositories.DepartmentRepository;
import com.example.EmployeeLab.repositories.EmployeeRepository;
import com.example.EmployeeLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveEmployeeAndDepartmentAndProject(){
		Department department = new Department("Sales");
		departmentRepository.save(department);

		Employee employee = new Employee("Peter", "Sullivan", 12345, department);
		employeeRepository.save(employee);

		Project project = new Project("Innovative Marketing Strategy", 25);
		project.addEmployee(employee);
		projectRepository.save(project);
	}



}
