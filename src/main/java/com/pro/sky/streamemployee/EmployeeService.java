package com.pro.sky.streamemployee;

import java.util.List;

public interface EmployeeService  {




    public  Employee add(String firstName, String lastName, int deparment, double salary);

    public  Employee find(String firstName, String lastName, int deparment, double salary);

    public  Employee remove(String firstName, String lastName, int deparment, double salary);

    public  List<Object> getAll();


}








