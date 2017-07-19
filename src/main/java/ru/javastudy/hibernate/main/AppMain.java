package ru.javastudy.hibernate.main;

import org.hibernate.Query;
import org.hibernate.Session;
import ru.javastudy.hibernate.dao.Department;
import ru.javastudy.hibernate.dao.Employee;
import ru.javastudy.hibernate.dao.implementations.DepartmentDAOImpl;
import ru.javastudy.hibernate.dao.implementations.EmployeeDAOImpl;
import ru.javastudy.hibernate.utils.HibernateSessionFactory;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;


public class AppMain {

    @PersistenceUnit
    static EntityManager emf;

    public static void main(String[] args) {

//        Session session = HibernateSessionFactory.getSessionFactory().openSession();
//
//        session.beginTransaction();
//
//        Query query = session.createQuery("FROM Employee");
//        List employees = query.list();
//
//        for (Object employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println("SUCCESS");
//
//        HibernateSessionFactory.shutdown();
    }
}
