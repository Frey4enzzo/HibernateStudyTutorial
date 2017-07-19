package ru.javastudy.hibernate.dao.implementations;

import org.hibernate.Session;
import ru.javastudy.hibernate.dao.Department;
import ru.javastudy.hibernate.dao.interfaces.DepartmentDAO;

import java.util.List;


public class DepartmentDAOImpl implements DepartmentDAO {

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public List<Department> findAllDepartments() {
        return session.createQuery("FROM Department c").list();
    }

    public Department findDepartmentById(Long id) {
        return null;
    }

    public Department saveDepartment(Department department) {
        return null;
    }

    public void deleteDepartment(Department department) {

    }
}
