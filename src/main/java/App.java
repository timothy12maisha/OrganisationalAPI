import dao.Sql2oDepartment;
import dao.Sql2oNews;
import dao.Sql2oUser;
import models.Department;
import models.News;
import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import com.google.gson.Gson;
import static spark.Spark.*;
public class App {
    public static void main (String[] args){
        Sql2oDepartment departmentDao;
        Sql2oNews newsDao;
        Sql2oUser usersDao;
        Connection conn;
        Gson gson = new Gson();
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString,"sean","access");
        departmentDao = new Sql2oDepartment(sql2o);
        usersDao = new Sql2oUser(sql2o);
        newsDao = new Sql2oNews(sql2o);
        post("/department/new","application/json",(req,res)-> {
            Department department = gson.fromJson(req.body(),Department.class);
            departmentDao.add(department);
            res.status(201);
            res.type("application/json");
            return gson.toJson(department);
        });
        get("/department","application/json",(req,res)->{
            res.type("application/json");
            return gson.toJson(departmentDao.allDepartments());
        });
        get("/department/:id", "application/json", (req, res) -> {
            res.type("application/json");
            int departmentId = Integer.parseInt(req.params("id"));
            res.type("application/json");
            return gson.toJson(usersDao.findById(departmentId));
        });
        post("/users/new","application/json",(req,res)-> {
            Users users = gson.fromJson(req.body(),Users.class);
            usersDao.add(users);
            res.status(201);
            res.type("application/json");
            return gson.toJson(users);
        });
        get("/users","application/json",(req,res)->{
            res.type("application/json");
            return gson.toJson(usersDao.allUsers());
        });
        get("/users/:id", "application/json", (req, res) -> {
            res.type("application/json");
            int usersId = Integer.parseInt(req.params("id"));
            res.type("application/json");
            return gson.toJson(usersDao.findById(usersId));
        });
        post("/news/new","application/json",(req,res)-> {
            News news = gson.fromJson(req.body(),News.class);
            newsDao.add(news);
            res.status(201);
            res.type("application/json");
            return gson.toJson(news);
        });
        get("/news","application/json",(req,res)->{
            res.type("application/json");
            return gson.toJson(newsDao.allNews());
        });
        get("/news/:id", "application/json", (req, res) -> {
            res.type("application/json");
            int newsId = Integer.parseInt(req.params("id"));
            res.type("application/json");
            return gson.toJson(newsDao.findById(newsId));
        });
    }
}