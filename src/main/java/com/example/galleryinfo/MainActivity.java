package com.example.galleryinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView studentListRecyclerView;
    private StudentAdapter studentAdapter;
    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adding name and image in student array
        students = new ArrayList<>();
        students.add(new Student("Divyanshu Kumar", R.drawable.avatar_2__1_));
        students.add(new Student("Mayank Vishwakarma", R.drawable.avatar_3__1_));
        students.add(new Student("Rahul Kumar", R.drawable.avatar_4__1_));
        students.add(new Student("Harish Choure", R.drawable.avatar_3__1_));
        students.add(new Student("Rushi Goswami", R.drawable.avatar_4__1_));
        students.add(new Student("Subham Malik\n", R.drawable.avatar_3__1_));


        studentListRecyclerView = findViewById(R.id.student_list);
        studentListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        studentAdapter = new StudentAdapter(students, true);
        studentListRecyclerView.setAdapter(studentAdapter);


//        checking which button is clicked

//        if (listButton.setOnClickListener == true) {
//            listButton.setOnClickListener(v -> {
//            studentAdapter = new StudentAdapter(students, true);
//            studentListRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//            studentListRecyclerView.setAdapter(studentAdapter);
//        });
//        }




        Button listButton = findViewById(R.id.list_button);
        listButton.setOnClickListener(v -> {
            studentAdapter = new StudentAdapter(students, true);
            studentListRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            studentListRecyclerView.setAdapter(studentAdapter);
        });

        Button gridButton = findViewById(R.id.grid_button);
        gridButton.setOnClickListener(v -> {
            studentAdapter = new StudentAdapter(students, false);
            studentListRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
            studentListRecyclerView.setAdapter(studentAdapter);
        });
    }
    public class Student {
        private String name;
        private int profileImage;

        public Student(String name, int profileImage) {
            this.name = name;
            this.profileImage = profileImage;
        }

        public String getName() {
            return name;
        }

        public int getProfileImage() {
            return profileImage;
        }
    }

}
