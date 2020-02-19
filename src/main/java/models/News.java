package models;

import java.util.Objects;

public class News {
    private String title;
    private String department;
    private String description;
    private String author;

    public News(String title, String department, String description, String author) {
        this.title = title;
        this.department = department;
        this.description = description;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return title.equals(news.title) &&
                department.equals(news.department) &&
                description.equals(news.description) &&
                author.equals(news.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, department, description, author);
    }
}
