package dao;
import org.sql2o.Sql2o;
import models.News;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;
import java.util.List;

public class Sql2oNews implements NewsInterface {
    private final Sql2o sql2o;
    public Sql2oNews(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(News news) {

        String sql = "INSERT INTO news (title,department,description,author) VALUES (:title,:department,:description,:author)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .addParameter("title", news.getTitle())
                    .addParameter("description", news.getDescription())
                    .addParameter("author", news.getAuthor())
                    .executeUpdate()
                    .getKey();

        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void addNewsToDepartment(int deptid, int newsid, int userid) {

    }

    @Override
    public News findById(int id) {
        return null;
    }

    @Override
    public List<News> allNews() {
        return null;
    }

    @Override
    public List<News> allGeneralNews() {
        return null;
    }

    @Override
    public List<News> allDepartmentalNews() {
        return null;
    }

}