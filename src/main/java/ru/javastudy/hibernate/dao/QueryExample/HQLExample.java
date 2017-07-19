package ru.javastudy.hibernate.dao.QueryExample;

import org.hibernate.Session;
import ru.javastudy.hibernate.utils.HibernateSessionFactory;


public class HQLExample {

    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();


//        Query query = session.createQuery("INSERT INTO Department (wsedvf)");


        session.getTransaction().commit();
        HibernateSessionFactory.shutdown();
    }

    /**
     * Выбираем все объекты из таблицы Employee
     * Query query = session.createQuery("FROM Employee");
     * ----
     *
     */


}
