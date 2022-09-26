package com.example.firstapp;

import java.util.Comparator;
import java.util.List;

public class Employee  {

    private int id ;
    private String name;
    private List<String> ss;


    public Employee(int id, String name, List<String> ss) {
        this.id = id;
        this.name = name;
        this.ss = ss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ss=" + ss +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSs() {
        return ss;
    }

    public void setSs(List<String> ss) {
        this.ss = ss;
    }
}
