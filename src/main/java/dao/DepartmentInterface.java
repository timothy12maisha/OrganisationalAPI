package dao;
import models.Department;
import models.Users;
import java.util.List;

public interface DepartmentInterface {

    void add(Department department);
    void addsUserToDepartment(Department department,Users user);

    DepartmentInterface findById(int id);
    List<DepartmentInterface> allDepartments();
    List<Users> allDepartmentEmployees(int deptId);
    List<Users> allDepartmentNews(int deptId);
}