public class Department {
    private String departmentname;
    private String description;
    private int employeenumbers;

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployeenumbers() {
        return employeenumbers;
    }

    public void setEmployeenumbers(int employeenumbers) {
        this.employeenumbers = employeenumbers;
    }

    public Department(String departmentname, String description, int employeenumbers) {
        this.departmentname = departmentname;
        this.description = description;
        this.employeenumbers = employeenumbers;
    }
}
