package dao;
import models.Users;
import org.sql2o.Sql2o;
import models.Department;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;
import java.util.List;

public class Sql2oDepartment implements DepartmentInterface {
    private final Sql2o sql2o;

    public Sql2oDepartment(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Department department) {

        String sql = "INSERT INTO department (departmentname,description,employeenumbers) VALUES (:departmentname,:description,:emloyeenumbers)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .addParameter("department", department.getDepartmentname())
                    .addParameter("description", department.getDescription())
                    .addParameter("employeesnumbers", department.getEmployeenumbers())
                    .executeUpdate()
                    .getKey();

        } catch (Sql2oException ex) {
            System.out.println(ex);
        }

    }


    @Override
    public void addsUserToDepartment(Department department, Users user) {
        String sql = "INSERT INTO Department(departmentname,description,employeenumbers) VALUES (:departmentname,:description,:emloyeenumbers)";
        try(Connection con = sql2o.open()){
            int id = (int) con.createQuery(sql,true)
                    .bind(department)
                    .executeUpdate()
                    .getKey();
            department.setId(id);
        }catch(Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public DepartmentInterface findById(int id) {
        return null;
    }

    @Override
    public List<DepartmentInterface> allDepartments() {
        return null;
    }

    @Override
    public List<Users> allDepartmentEmployees(int deptId) {
        return null;
    }

    @Override
    public List<Users> allDepartmentNews(int deptId) {
        return null;
    }
}