package com.example.projectapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import com.example.projectapp.model.Employee;

public class MainActivity8 extends AppCompatActivity {

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
        employee1.setEmployee_name("Ravi Kumar");
        employee1.setEmployee_image("https://images.pexels.com/photos/3783577/pexels-photo-3783577.jpeg?cs=srgb&dl=pexels-andrea-piacquadio-3783577.jpg&fm=jpg");
        employee1.setEmployee_position("Executive Director");
        employee1.setEmployee_salary(90000);
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee_name("Zoe Williams");
        employee2.setEmployee_image("https://s1.bloknot-rostov.ru/thumb/850x0xcut/upload/iblock/e6e/8gd4wtv80jo6lm4leo1pu9i98wp170x3/men.jpg");
        employee2.setEmployee_position("Department Manager");
        employee2.setEmployee_salary(20000);
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployee_name("Riley Parker");
        employee3.setEmployee_image("https://static.vecteezy.com/system/resources/thumbnails/023/907/078/small/young-smiling-businesswoman-standing-in-blur-background-of-office-generative-ai-photo.jpg");
        employee3.setEmployee_position("Department Manager");
        employee3.setEmployee_salary(66000);
        employees.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmployee_name("Grace King");
        employee4.setEmployee_image("https://img.freepik.com/free-photo/office-manager_1098-15308.jpg");
        employee4.setEmployee_position("Department Manager");
        employee4.setEmployee_salary(82000);
        employees.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmployee_name("Ava King");
        employee5.setEmployee_image("https://clearsourcebpo.com/wp-content/uploads/2022/03/iStock-1055083158.jpg");
        employee5.setEmployee_position("Department Customer Manager");
        employee5.setEmployee_salary(12000);
        employees.add(employee5);

        Employee employee6 = new Employee();
        employee6.setEmployee_name("Natalie Mitchell");
        employee6.setEmployee_image("https://constructionprojectmanagementpro.com/wp-content/uploads/2014/06/Project-Manager.jpg");
        employee6.setEmployee_position("Project Manager");
        employee6.setEmployee_salary(90000);
        employees.add(employee6);

        Employee employee7 = new Employee();
        employee7.setEmployee_name("Mia Sanchez");
        employee7.setEmployee_image("https://st.depositphotos.com/4218696/53448/i/1600/depositphotos_534489368-stock-photo-emotional-indian-man-project-manager.jpg");
        employee7.setEmployee_position("Anwar Rahman");
        employee7.setEmployee_salary(20000);
        employees.add(employee7);

        Employee employee8 = new Employee();
        employee8.setEmployee_name("Ali Khan");
        employee8.setEmployee_image("https://media.planview.com/clarizen/wp-content/upload/2017/05/Six-Traits-e1495217294358.jpg");
        employee8.setEmployee_position("Project Manager");
        employee8.setEmployee_salary(40000);
        employees.add(employee8);

        Employee employee9 = new Employee();
        employee9.setEmployee_name("Le Thi Tran");
        employee9.setEmployee_image("https://media.planview.com/clarizen/wp-content/upload/2017/05/Top-Qualities.jpg");
        employee9.setEmployee_position("Project Manager");
        employee9.setEmployee_salary(50000);
        employees.add(employee9);

        mAdapter = new MyAdapter(employees, this);
        recyclerView.setAdapter(mAdapter);

    }
}
