package com.example.projectapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import com.example.projectapp.model.Employee;
public class MainActivity6 extends AppCompatActivity {

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
        employee1.setEmployee_name("Priya Patel");
        employee1.setEmployee_image("https://www.simplilearn.com/ice9/free_resources_article_thumb/Software_Engineer_Salary_in_2023.jpg");
        employee1.setEmployee_position("Data Analyst");
        employee1.setEmployee_salary(50000);
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee_name("Aisha Khan");
        employee2.setEmployee_image("https://thismomisonfire.com/wp-content/uploads/2023/03/woman-software-engineer.jpg");
        employee2.setEmployee_position("Software Tester");
        employee2.setEmployee_salary(30000);
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployee_name("Mei Chen");
        employee3.setEmployee_image("https://www.totaltek.com/wp-content/uploads/2021/12/shutterstock_1692056791.jpg");
        employee3.setEmployee_position("Software Tester");
        employee3.setEmployee_salary(66000);
        employees.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmployee_name("Nisha Gupta");
        employee4.setEmployee_image("https://pspdfkit.com/assets/images/blog/2017/women-in-software-development/rita-working-d49c61e5.jpg");
        employee4.setEmployee_position("Recruitment Coordinator");
        employee4.setEmployee_salary(22000);
        employees.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmployee_name("Amir Pate");
        employee5.setEmployee_image("https://resources.stuff.co.nz/content/dam/images/1/k/x/f/6/7/image.related.StuffLandscapeSixteenByNine.1420x800.1kwwrt.png/1502329208446.jpg");
        employee5.setEmployee_position("Data Analyst");
        employee5.setEmployee_salary(112000);
        employees.add(employee5);

        Employee employee6 = new Employee();
        employee6.setEmployee_name("Arjun Gupta");
        employee6.setEmployee_image("https://img.freepik.com/premium-photo/portrait-male-programmer-office_392895-11888.jpg");
        employee6.setEmployee_position("Software Developer");
        employee6.setEmployee_salary(90000);
        employees.add(employee6);

        Employee employee7 = new Employee();
        employee7.setEmployee_name("Ali Ahmed");
        employee7.setEmployee_image("https://thumbs.dreamstime.com/b/software-developer-smiling-young-working-computer-54668839.jpg");
        employee7.setEmployee_position("Data Analyst");
        employee7.setEmployee_salary(30000);
        employees.add(employee7);

        Employee employee8 = new Employee();
        employee8.setEmployee_name("Ravi Sharma");
        employee8.setEmployee_image("https://as2.ftcdn.net/v2/jpg/02/31/77/67/1000_F_231776705_GH5eziqErxGIIR5sywVoP1TChbUgLfdR.jpg");
        employee8.setEmployee_position("Software Developer");
        employee8.setEmployee_salary(40000);
        employees.add(employee8);

        Employee employee9 = new Employee();
        employee9.setEmployee_name("Priya Reddy");
        employee9.setEmployee_image("https://t4.ftcdn.net/jpg/01/88/53/19/360_F_188531911_OT2zuKgdK9pS0oalRoA5SFWYNswHjMJy.jpg");
        employee9.setEmployee_position("Software Developer");
        employee9.setEmployee_salary(50000);
        employees.add(employee9);

        mAdapter = new MyAdapter(employees, this);
        recyclerView.setAdapter(mAdapter);

    }
}