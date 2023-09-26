package com.example.projectapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import com.example.projectapp.model.Employee;

public class MainActivity4 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Employee> employees = new ArrayList<Employee>();
        Employee employee1 = new Employee();
        employee1.setEmployee_name("Harper Smith");
        employee1.setEmployee_image("https://www.plazacool.com/attachments/product/images_1-2593986.jpg");
        employee1.setEmployee_position("Sales Representative");
        employee1.setEmployee_salary(60000);
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee_name("Emily Jones");
        employee2.setEmployee_image("https://c.lnwfile.com/_/c/_raw/mx/34/cp.jpg");
        employee2.setEmployee_position("Sales Manager");
        employee2.setEmployee_salary(25000);
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployee_name("Elizabeth Davis");
        employee3.setEmployee_image("https://www.dailynews.co.th/wp-content/uploads/2021/07/PED_0487-1.jpg");
        employee3.setEmployee_position("Sales Manager");
        employee3.setEmployee_salary(26000);
        employees.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmployee_name("Sofia Martinez");
        employee4.setEmployee_image("https://img.freepik.com/free-photo/portrait-beautiful-young-businesswoman_329181-11449.jpg");
        employee4.setEmployee_position("Customer Relationship Manager");
        employee4.setEmployee_salary(22000);
        employees.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmployee_name("Ella Wilson");
        employee5.setEmployee_image("https://img.freepik.com/free-photo/young-business-woman-gray-wall_155003-2168.jpg");
        employee5.setEmployee_position("Customer Relationship Manager");
        employee5.setEmployee_salary(18000);
        employees.add(employee5);

        Employee employee6 = new Employee();
        employee6.setEmployee_name("Lily Davis");
        employee6.setEmployee_image("https://img.freepik.com/free-photo/portrait-young-asia-lady-with-positive-expression-arms-crossed-smile-broadly-dressed-casual-clothing-looking-camera-pink-background_7861-3201.jpg?size=626&ext=jpg");
        employee6.setEmployee_position("Marketing Manager");
        employee6.setEmployee_salary(88000);
        employees.add(employee6);

        Employee employee7 = new Employee();
        employee7.setEmployee_name("Chloe Johnson");
        employee7.setEmployee_image("https://img.freepik.com/free-photo/young-asian-business-woman-executive-good-looking-confidently-while-standing-pointing-finger_74952-3028.jpg?size=626&ext=jpg");
        employee7.setEmployee_position("Market Analyst");
        employee7.setEmployee_salary(32000);
        employees.add(employee7);

        Employee employee8 = new Employee();
        employee8.setEmployee_name("Henry Anderson");
        employee8.setEmployee_image("https://c8.alamy.com/comp/ADTC5W/middle-aged-male-office-worker-standing-by-cubicle-portrait-ADTC5W.jpg");
        employee8.setEmployee_position("Market Analyst");
        employee8.setEmployee_salary(20000);
        employees.add(employee8);

        Employee employee9 = new Employee();
        employee9.setEmployee_name("Daniel Wilson");
        employee9.setEmployee_image("https://img.freepik.com/free-photo/young-co-worker-spending-time-office_23-2149328341.jpg");
        employee9.setEmployee_position("Sales Representative");
        employee9.setEmployee_salary(30000);
        employees.add(employee9);

        mAdapter = new MyAdapter(employees, this);
        recyclerView.setAdapter(mAdapter);

    }
}