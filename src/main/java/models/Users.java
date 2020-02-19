package models;

import java.util.Objects;

public class Users {
    private int id;
    private String position;
    private String role;
    private String department;

    public String getCompany() {
        return position;
    }

    public void setCompany(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Users(String position, String role, String department) {
        this.position = position;
        this.role = role;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return position.equals(users.position) &&
                role.equals(users.role) &&
                department.equals(users.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, role, department);
    }
}
