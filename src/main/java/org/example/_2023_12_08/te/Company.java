package org.example._2023_12_08.te;

public class Company {
    private String cName;
    private Department departments;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Department getDepartments() {
        return departments;
    }

    public void setDepartments(Department departments) {
        this.departments = departments;
    }
}

class Department {
    private String depName;
    private Employee employees;

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }
}

class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {

    }
}