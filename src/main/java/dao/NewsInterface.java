package dao;
import models.News;
import java.util.List;

public interface NewsInterface {
    void add(News news);
    void addNewsToDepartment(int deptid, int newsid, int userid);

    News findById(int id);
    List<News> allNews();
    List<News> allGeneralNews();
    List<News> allDepartmentalNews();
}
