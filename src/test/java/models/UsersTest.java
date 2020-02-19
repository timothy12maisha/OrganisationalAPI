package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void getCompany() {
        Users newUser =new Users("bidco","","");
        assertEquals("bidco",newUser.getCompany());
    }

    @Test
    public void getRole() {
        Users newUser = new Users("","Manager","");
        assertEquals("Manager", newUser.getRole());
    }

    @Test
    public void getDepartment() {
        Users newUser = new Users("","","Management");
        assertEquals("Management", newUser.getDepartment());
    }
}