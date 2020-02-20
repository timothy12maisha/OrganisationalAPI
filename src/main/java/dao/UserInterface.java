
package dao;

import models.News;
import models.Users;
import java.util.List;

public interface UserInterface {
    //create
    void add(Users user);

    //read
    Users findById(int id);
    List<Users> allUsers();
    List<News> myNews(int userId);
}

