package ru.javastudy.hibernate.dao.QueryExample;


import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.*;
import ru.javastudy.hibernate.dao.Department;
import ru.javastudy.hibernate.dao.Employee;
import ru.javastudy.hibernate.utils.HibernateSessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CriteriaExample {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

//        Criteria criteria = session.createCriteria(Employee.class);


        session.getTransaction().commit();
        HibernateSessionFactory.shutdown();


    }

    /**
     * TODO: Возвращаем список отделов
     * Criteria criteria = session.createCriteria(Department.class);
     * List<Department> departments = criteria.list();
     * ------------------------------------------------------------------------------
     * TODO: Получаем список отделов, у которых поле name equals ЖКХ
     * criteria.add(Restrictions.eq("name", "ЖКХ"));                              EQ
     * List<Department> departments = criteria.list();
     * ------------------------------------------------------------------------------
     * TODO: Получаем список отделов, у которых поле name NOT equals ЖКХ
     * criteria.add(Restrictions.ne("name", "ЖКХ"));                              NE
     * Нельзя использовать NE, если поля сравниваемого объекта равны нулю
     * ------------------------------------------------------------------------------
     * TODO: Получаем список сотрудников, чье имя начинается на Алек (ищем подстроку Алек в столбце firstname)
     * criteria.add(Restrictions.like("firstname", "Алек", MatchMode.ANYWHERE));          LIKE
     * ------------------------------------------------------------------------------
     * TODO: Получаем список сотрудников, у которых должность не указана (поле равно Null)
     * criteria.add(Restrictions.isNull("position"));                          isNull
     * ------------------------------------------------------------------------------
     * TODO: Получаем список сотрудников, чей возраст больше 29 лет
     * criteria.add(Restrictions.gt("age", 29));                                  GT
     * ------------------------------------------------------------------------------
     * TODO: Получаем список сотрудников, чей возраст больше 29 И имя(firstname) Алексей
     * criteria.add(Restrictions.gt("age", 29));                                  GT
     * criteria.add(Restrictions.like("firstname", "Алексей", MatchMode.ANYWHERE));
     * TODO: Когда мы добавляем больше чем один constraint, то все запросы интерпритируются
     * TODO: как логическое AND
     * ------------------------------------------------------------------------------
     * TODO: Для того, чтобы получить логическое OR необходимо использовать класс LogicalExpression
     * TODO: Получаем список сотрудников, чей возраст меньше 21 года или его имя Алексей
     * Criterion olderThan = Restrictions.lt("age", 21);
     * Criterion equalFirstname = Restrictions.like("firstname", "Алексей", MatchMode.ANYWHERE);
     * LogicalExpression orExp = Restrictions.or(olderThan, equalFirstname);
     * criteria.add(orExp);
     * ------------------------------------------------------------------------------
     * TODO: Ограничиваем получение результата до 1 записи в БД
     * crit.setFirstResult(1);
     * TODO: Устанавливаем максимальное количество записей в результате
     * crit.setMaxResults(20);
     * ------------------------------------------------------------------------------
     * TODO: Список сотрудников старше 21 года сортировка по убыванию
     * criteria.add(Restrictions.gt("age", 21));
     * criteria.addOrder(Order.desc("age"));
     * ------------------------------------------------------------------------------
     * TODO: Возвращаем количество записей в таблице
     * criteria.setProjection(Projections.rowCount());
     * TODO: возвращаем сумму значений в столбце age, получаем суммарный возраст
     * criteria.setProjection(Projections.sum("age"));
     * ------------------------------------------------------------------------------
     * TODO: Для множественного выбора используем ProjectionList
     * TODO: Делаем выборку, максимальный минимальный и средний возраст
     * Criteria criteria = session.createCriteria(Employee.class);
     * ProjectionList projectionList = Projections.projectionList();
     * projectionList.add(Projections.max("age"));
     * projectionList.add(Projections.min("age"));
     * projectionList.add(Projections.avg("age"));
     * criteria.setProjection(projectionList);
     *
     * Iterator it = criteria.list().iterator();
     * while (it.hasNext()) {
     * Object[] obj = (Object[]) it.next();
     * System.out.println("maxage: " + obj[0] + " minage: " + obj[1] + " avgage: " + obj[2]);
     * }
     * ------------------------------------------------------------------------------
     * TODO: INNER JOIN
     * String query = "SELECT firstname, lastname, position, department.name from employee\n" +
     * "  inner join department on employee.department_id = department.id";
     * SQLQuery query1 = session.createSQLQuery(query);
     * List list = query1.list();
     * for (Object o : list) {
     * Object[] array = (Object[]) o;
     * System.out.print(array[0] + " ");
     * System.out.print(array[1] + " ");
     * System.out.print(array[2] + " ");
     * System.out.print(array[3] + " |");
     }
     * ------------------------------------------------------------------------------
     *
     */
}
