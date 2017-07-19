package ru.javastudy.hibernate.dao.interfaces;


import ru.javastudy.hibernate.dao.Employee;

import java.util.List;

public interface EmployeeDAO {

    // return List Employees
    public List<Employee> findAllEmployees();

    // return Employee object by id
    public Employee findEmployeeById(Long id);

    // insert or update Employee object
    public Employee saveEmployee(Employee employee);


    public void deleteEmployee(Employee employee);
}
