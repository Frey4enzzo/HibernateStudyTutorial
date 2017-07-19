package ru.javastudy.hibernate.dao.interfaces;


import ru.javastudy.hibernate.dao.Department;
import java.util.List;

public interface DepartmentDAO {

    // Найти все отделы
    public List<Department> findAllDepartments();

    // Найти отдел по идентификатору
    public Department findDepartmentById (Long id);

    // Изменить или добавить новый отдел
    public Department saveDepartment(Department department);

    // Удалить отдел
    public void deleteDepartment(Department department);

}
