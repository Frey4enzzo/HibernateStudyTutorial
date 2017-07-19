package ru.javastudy.hibernate.dao.implementations;

import org.hibernate.Session;
import ru.javastudy.hibernate.dao.Employee;
import ru.javastudy.hibernate.dao.interfaces.EmployeeDAO;
import java.util.List;


public class EmployeeDAOImpl implements EmployeeDAO {

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }


    public List<Employee> findAllEmployees() {
        return session.createQuery("FROM Employee c").list();
    }

    public Employee findEmployeeById(Long id) {
        return null;
    }

    public Employee saveEmployee(Employee employee) {
        return null;
    }

    public void deleteEmployee(Employee employee) {

    }
}
