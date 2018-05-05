package com.example.dipankar.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmployeeBuilder builder = new EmployeeBuilder(); // new object builder of Employee Builder
        builder.setId(7);
        builder.setName("Dipankar");
        builder.setAddress("Piscataway,NJ");
        builder.setAge(23);
        //builder objects
        EmployeeBuilder build = new EmployeeBuilder();
        build.setId(8);
        build.setAge(25);
        build.setName("Sathya");
        build.setAddress("Bangalore");
        Employee emp = build.builder();

        Toast.makeText(this, emp.toString(), Toast.LENGTH_SHORT).show();
        //Toast is basically notifying the user
        System.out.println(emp);

        Employee employee = builder.builder();

        Toast.makeText(this, employee.toString(), Toast.LENGTH_SHORT).show();
        //Toast is basically notifying the user
        System.out.println(employee);
        TextView id = findViewById(R.id.Builder);
        id.setText(employee.toString()); // all the data of the employee is being printed at one go

        Log.i("Dip", employee.toString());
    }

        private void updateUI(){

    }
}
