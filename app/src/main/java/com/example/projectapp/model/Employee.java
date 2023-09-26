package com.example.projectapp.model;

public class Employee {
    private String Employee_image;
    private String Employee_name;
    private String Employee_position;

    private int Employee_salary;



    public String getEmployee_image() {
        return Employee_image;
    }

    public void setEmployee_image(String employee_image) {
        this.Employee_image = employee_image;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.Employee_name = employee_name;
    }

    public String getEmployee_position() {
        return Employee_position;
    }

    public void setEmployee_position(String employee_position) {this.Employee_position = employee_position;
    }

    public int getEmployee_salary() {
        return Employee_salary;
    }

    public void setEmployee_salary(int employee_salary) {
        this.Employee_salary = employee_salary;
    }

}


