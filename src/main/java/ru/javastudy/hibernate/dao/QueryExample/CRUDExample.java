package ru.javastudy.hibernate.dao.QueryExample;


import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import ru.javastudy.hibernate.dao.Employee;
import ru.javastudy.hibernate.utils.HibernateSessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class CRUDExample {
    public static void main(String[] args) {

        Employee employee = new Employee("Олег", "Олегов", "Экономист");



        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction().begin();

        // Скалярные запросы
        String query = "SELECT firstname, department.name from employee" +
                "inner join department_id = department.id";
        SQLQuery sqlQuery = session.createSQLQuery(query);
        sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List list = sqlQuery.list();

        for (Object o : list) {
            System.out.println(o);
        }

//        session.beginTransaction();
//        session.getTransaction().begin();
//        session.save(employee);
//        session.getTransaction().commit();
//
//
//
//        session.getTransaction().commit();
        HibernateSessionFactory.shutdown();
    }
}
