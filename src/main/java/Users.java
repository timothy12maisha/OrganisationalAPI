public class Users {
    private String company;
    private String role;
    private String department;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public Users(String company, String role, String department) {
        this.company = company;
        this.role = role;
        this.department = department;
    }
}
