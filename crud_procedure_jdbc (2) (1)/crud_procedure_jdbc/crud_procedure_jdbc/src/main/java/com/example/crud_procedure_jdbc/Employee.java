package com.example.crud_procedure_jdbc;


public class Employee {

    private Long id;
    private String fname;
    private String lname;

    public Employee(Long id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }


    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getFname() {

        return fname;
    }

    public void setFname(String fname) {

        this.fname = fname;
    }

    public String getLname() {

        return lname;
    }

    public void setLname(String lname) {

        this.lname = lname;
    }
}
