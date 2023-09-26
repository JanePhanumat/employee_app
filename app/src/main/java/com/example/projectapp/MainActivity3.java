package com.example.projectapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import com.example.projectapp.model.Employee;

public class MainActivity3 extends AppCompatActivity {

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
        employee1.setEmployee_name("Benjamin Harris");
        employee1.setEmployee_image("https://png.pngtree.com/background/20211216/original/pngtree-business-day-and-morning-male-staff-indoor-office-photography-map-with-picture-image_1519724.jpg");
        employee1.setEmployee_position("Accountant");
        employee1.setEmployee_salary(50000);
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee_name("Ethan Smith");
        employee2.setEmployee_image("https://previews.123rf.com/images/jackf/jackf1803/jackf180305924/97752676-male-employee-is-having-productive-day-at-work-in-office.jpg");
        employee2.setEmployee_position("Accountant");
        employee2.setEmployee_salary(20000);
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployee_name("Olivia Anderson");
        employee3.setEmployee_image("https://img.freepik.com/free-photo/portrait-corporate-woman-holding-clipboard-work-standing-formal-outfit-white-background_1258-88411.jpg");
        employee3.setEmployee_position("Finance Manager");
        employee3.setEmployee_salary(66000);
        employees.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmployee_name("Ava Williams");
        employee4.setEmployee_image("https://img.freepik.com/free-photo/young-tender-curly-girl-holding-documents_176420-238.jpg");
        employee4.setEmployee_position("Finance Manager");
        employee4.setEmployee_salary(22000);
        employees.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmployee_name("Sophia Davis");
        employee5.setEmployee_image("https://t4.ftcdn.net/jpg/03/67/06/23/360_F_367062307_InO1FoF23QvKWfQ7OPpD5zjxT731F48N.jpg");
        employee5.setEmployee_position("Financial Controller");
        employee5.setEmployee_salary(12000);
        employees.add(employee5);

        Employee employee6 = new Employee();
        employee6.setEmployee_name("Mia Taylor");
        employee6.setEmployee_image("https://img.freepik.com/free-photo/portrait-happy-smiling-business-woman-with-black-folder-isolated-white-wall_231208-8616.jpg");
        employee6.setEmployee_position("Financial Controller");
        employee6.setEmployee_salary(90000);
        employees.add(employee6);

        Employee employee7 = new Employee();
        employee7.setEmployee_name("Charlotte Brown");
        employee7.setEmployee_image("https://img.freepik.com/free-photo/businesswoman-holding-notebook_1098-1212.jpg");
        employee7.setEmployee_position("Financial Controller");
        employee7.setEmployee_salary(20000);
        employees.add(employee7);

        Employee employee8 = new Employee();
        employee8.setEmployee_name("Amelia Martinez");
        employee8.setEmployee_image("https://img.freepik.com/free-photo/portrait-happy-manager-holding-leather-case_1262-5329.jpg");
        employee8.setEmployee_position("Tax Specialist");
        employee8.setEmployee_salary(40000);
        employees.add(employee8);

        Employee employee9 = new Employee();
        employee9.setEmployee_name("Noah Williams");
        employee9.setEmployee_image("https://img.freepik.com/free-photo/portrait-handsome-businessman-holding-smartphone-while-working-computer-his-desk-he-is_1258-80610.jpg");
        employee9.setEmployee_position("Tax Specialist");
        employee9.setEmployee_salary(50000);
        employees.add(employee9);



        mAdapter = new MyAdapter(employees, this);
        recyclerView.setAdapter(mAdapter);

    }
}