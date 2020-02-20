package dao;

import models.News;
import models.Users;
import org.sql2o.Sql2o;
import models.Department;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;
import java.util.List;

public class Sql2oUser implements UserInterface {
    private final Sql2o sql2o;

    public Sql2oUser(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Users User) {

        String sql = "INSERT INTO department (Company,Role,Department) VALUES (:Company,:Role,:Department)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .addParameter("Company", User.getCompany())
                    .addParameter("Role", User.getRole())
                    .addParameter("Department", User.getDepartment())
                    .executeUpdate()
                    .getKey();

        } catch (Sql2oException ex) {
            System.out.println(ex);
        }

    }

    @Override
    public Users findById(int id) {
        return null;
    }

    @Override
    public List<Users> allUsers() {
        return null;
    }

    @Override
    public List<News> myNews(int userId) {
        return null;
    }
}