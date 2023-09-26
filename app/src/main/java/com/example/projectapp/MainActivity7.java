package com.example.projectapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import com.example.projectapp.model.Employee;
public class MainActivity7 extends AppCompatActivity {

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
        employee1.setEmployee_name("Abdullah Kimura");
        employee1.setEmployee_image("https://thumbs.dreamstime.com/b/plant-manager-giving-instructions-office-portrait-bearded-businessman-wearing-hardhat-overseeing-production-process-112515396.jpg");
        employee1.setEmployee_position("Plant Manager");
        employee1.setEmployee_salary(80000);
        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee_name("Hiroshi Rahman");
        employee2.setEmployee_image("https://as1.ftcdn.net/v2/jpg/05/22/06/38/1000_F_522063854_2HIPpwTdspKEKeVdZk8Voz9vGKi5WVJP.jpg");
        employee2.setEmployee_position("Technician");
        employee2.setEmployee_salary(18000);
        employees.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployee_name("Hiroshi Tanaka");
        employee3.setEmployee_image("https://previews.123rf.com/images/bialasiewicz/bialasiewicz1405/bialasiewicz140500290/28210952-male-production-workers-working-during-production-process.jpg");
        employee3.setEmployee_position("Production Worker");
        employee3.setEmployee_salary(66000);
        employees.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmployee_name("Wei Chen");
        employee4.setEmployee_image("https://st.focusedcollection.com/16485780/i/1800/focused_202759884-stock-photo-male-technician-fixing-equipment-server.jpg");
        employee4.setEmployee_position("Technician");
        employee4.setEmployee_salary(22000);
        employees.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmployee_name("Wei Liu");
        employee5.setEmployee_image("https://c8.alamy.com/comp/KR5JDW/male-technician-repairing-camera-KR5JDW.jpg");
        employee5.setEmployee_position("Technician");
        employee5.setEmployee_salary(12000);
        employees.add(employee5);

        Employee employee6 = new Employee();
        employee6.setEmployee_name("Siti Rahmah");
        employee6.setEmployee_image("https://st.focusedcollection.com/13397678/i/1800/focused_169049210-stock-photo-portrait-male-factory-worker-factory.jpg");
        employee6.setEmployee_position("Production Worker");
        employee6.setEmployee_salary(90000);
        employees.add(employee6);

        Employee employee7 = new Employee();
        employee7.setEmployee_name("Deepa Kapoor");
        employee7.setEmployee_image("https://media.glamourmagazine.co.uk/photos/61f94aa84a8194d35d9f6eed/3:2/w_1920,h_1280,c_limit/WORK%20WEAR%20010222%20DEFAULT.jpg");
        employee7.setEmployee_position("Quality Control Manager");
        employee7.setEmployee_salary(20000);
        employees.add(employee7);

        Employee employee8 = new Employee();
        employee8.setEmployee_name("Sumiko Suzuki");
        employee8.setEmployee_image("https://images.pexels.com/photos/864994/pexels-photo-864994.jpeg?cs=srgb&dl=pexels-andrea-piacquadio-864994.jpg&fm=jpg");
        employee8.setEmployee_position("Quality Control Manager");
        employee8.setEmployee_salary(40000);
        employees.add(employee8);

        Employee employee9 = new Employee();
        employee9.setEmployee_name("Yuki Nakamura");
        employee9.setEmployee_image("https://img.freepik.com/premium-photo/young-woman-working-modern-business-office_977958-2002.jpg");
        employee9.setEmployee_position("Production Worker");
        employee9.setEmployee_salary(50000);
        employees.add(employee9);

        mAdapter = new MyAdapter(employees, this);
        recyclerView.setAdapter(mAdapter);

    }
}
