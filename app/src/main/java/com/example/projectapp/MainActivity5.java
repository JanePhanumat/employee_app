package com.example.projectapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import com.example.projectapp.model.Employee;

public class MainActivity5 extends AppCompatActivity {

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
        employee1.setEmployee_name("Isabella Turner");
        employee1.setEmployee_image("https://img.freepik.com/free-photo/young-person-during-intership_23-2149315588.jpg");
        employee1.setEmployee_position("Human Resources Manager");
        employee1.setEmployee_salary(50000);
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee_name("Harper Thompson");
        employee2.setEmployee_image("https://t4.ftcdn.net/jpg/03/63/12/47/360_F_363124731_35jLS69Ohb2y4BC03amFxuWsRblrzIGs.jpg");
        employee2.setEmployee_position("Recruitment Coordinator");
        employee2.setEmployee_salary(20000);
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployee_name("Zoey Rodriguez");
        employee3.setEmployee_image("https://static.vecteezy.com/system/resources/thumbnails/023/907/078/small/young-smiling-businesswoman-standing-in-blur-background-of-office-generative-ai-photo.jpg");
        employee3.setEmployee_position("HR Coordinator");
        employee3.setEmployee_salary(66000);
        employees.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmployee_name("Lily Clark");
        employee4.setEmployee_image("https://thumbs.dreamstime.com/b/portrait-smiling-confident-female-boss-looking-camera-portrait-smiling-beautiful-millennial-businesswoman-ceo-looking-126917570.jpg");
        employee4.setEmployee_position("Recruitment Coordinator");
        employee4.setEmployee_salary(22000);
        employees.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmployee_name("Ava King");
        employee5.setEmployee_image("https://img.freepik.com/free-photo/young-business-woman-gray-wall_155003-2168.jpg");
        employee5.setEmployee_position("Training Coordinator");
        employee5.setEmployee_salary(12000);
        employees.add(employee5);

        Employee employee6 = new Employee();
        employee6.setEmployee_name("Chloe Baker");
        employee6.setEmployee_image("https://img.freepik.com/free-photo/happy-businesswoman-looking-camera-with-holding-pencil-diary_23-2148187247.jpg");
        employee6.setEmployee_position("HR Coordinator");
        employee6.setEmployee_salary(90000);
        employees.add(employee6);

        Employee employee7 = new Employee();
        employee7.setEmployee_name("Mia Sanchez");
        employee7.setEmployee_image("https://img.freepik.com/free-photo/low-angle-businesswoman-posing-with-arms-crossed-outdoors_23-2148767034.jpg");
        employee7.setEmployee_position("Training Coordinator");
        employee7.setEmployee_salary(20000);
        employees.add(employee7);

        Employee employee8 = new Employee();
        employee8.setEmployee_name("Emily Harris");
        employee8.setEmployee_image("https://img.freepik.com/premium-photo/businesswoman-standing-with-her-arms-crossed-office-while-her-colleagues-have-meeting-background_709984-10124.jpg");
        employee8.setEmployee_position("HR Coordinator");
        employee8.setEmployee_salary(40000);
        employees.add(employee8);

        Employee employee9 = new Employee();
        employee9.setEmployee_name("Amelia Young");
        employee9.setEmployee_image("https://img.freepik.com/premium-photo/young-woman-working-modern-business-office_977958-2002.jpg");
        employee9.setEmployee_position("HR Coordinator");
        employee9.setEmployee_salary(50000);
        employees.add(employee9);

        mAdapter = new MyAdapter(employees, this);
        recyclerView.setAdapter(mAdapter);

    }
}

