package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class NewsTest {

    @Test
    public void getTitle() {
        News newNews = new News("Proper Management","","","");
        assertEquals("Proper Management", newNews.getTitle());
    }

    @Test
    public void getDepartment() {
        News newNews = new News("","Management","","");
        assertEquals("Management", newNews.getDepartment());
    }

    @Test
    public void getDescription() {
        News newNews =new  News("", "", "","");
        assertEquals("", newNews.getDescription());
    }

    @Test
    public void getAuthor() {
        News newNews = new News("", "","","");
        assertEquals("", newNews.getAuthor());
    }
}