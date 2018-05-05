package com.example.dipankar.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.*;

public class Employee extends AppCompatActivity {

    //Main Employee class
    // Simple employee class which has id, name,age,address, phone, salary etc
    private int id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private float salary;

    public Employee(int id, String name, int age, String address, String phone, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        //This is a constructor i.e a parameterized constructor..
    }
    //getter functions...
    public int getId() {
        return id;
    } //getID

    public void setId(int id) {
        this.id = id;
    } //set the value of the id

    public String getName() {
        return name;
    } // get the name

    public void setName(String name) {
        this.name = name;
    } // set the name

    public int getAge() {
        return age;
    } //get the age

    public void setAge(int age) {
        this.age = age;
    } //set the age

    public String getAddress() {
        return address;
    } //get the address

    public void setAddress(String address) {
        this.address = address;
    } //set address

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                '}';

    }
 // Employee e = new Employee(7,"Raj",23,"Piscataway", "9176674343",3500);


    public String String() {

    return toString();
    }
}
