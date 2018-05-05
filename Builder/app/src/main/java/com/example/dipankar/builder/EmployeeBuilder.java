package com.example.dipankar.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EmployeeBuilder extends AppCompatActivity {

        private int gid; //global id
        private int id; //id of the employee
        private String name = ""; //name of the employee
        private int age; // age of the employee
        private String address = ""; //address of the employee
        private String phone = ""; // contact no. of the mployee
        private float salary; //salary of the employee

        public EmployeeBuilder() {
        //public constructor not used at the moment
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

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

        public Employee builder(){
            return new Employee(id, name, age, address, phone, salary);
            //returns the id,name,ag,address,phone and salary
        }
    }

