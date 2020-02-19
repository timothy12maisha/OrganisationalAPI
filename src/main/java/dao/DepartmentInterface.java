package dao;
import models.Users;
import java.util.List;

public interface DepartmentInterface {

    void add(DepartmentInterface department);
    void addUserToDept(DepartmentInterface department,Users user);

    DepartmentInterface findById(int id);
    List<DepartmentInterface> allDepartments();
    List<Users> allDepartmentEmployees(int deptId);
    List<Users> allDepartmentNews(int deptId);

}