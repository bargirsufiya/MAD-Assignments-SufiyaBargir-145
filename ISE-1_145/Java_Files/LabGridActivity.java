package com.example.ise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class LabGridActivity extends AppCompatActivity {

    ImageView lab1, lab2, lab3, lab4, lab5, lab6, lab7, lab8, lab9, lab10, lab11_new, lab12_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_grid);

        lab1 = findViewById(R.id.lab1);
        lab2 = findViewById(R.id.lab2);
        lab3 = findViewById(R.id.lab3);
        lab4 = findViewById(R.id.lab4);
        lab5 = findViewById(R.id.lab5);
        lab6 = findViewById(R.id.lab6);
        lab7 = findViewById(R.id.lab7);
        lab8 = findViewById(R.id.lab8);
        lab9 = findViewById(R.id.lab9);
        lab10 = findViewById(R.id.lab10);
        lab11_new = findViewById(R.id.lab11_new);
        lab12_new = findViewById(R.id.lab12_new);

        lab1.setOnClickListener(v -> openLab(R.drawable.lab1,"Lab 1","JAVA Programming Lab","The JAVA Programming lab is used to perform practicals of Advance C Programming, Data Structures, Information Security, Domain specific mini project and Compiler Construction. The software's that are installed includes Ubuntu OS, Open JDK and GCC packages."));
        lab2.setOnClickListener(v -> openLab(R.drawable.lab2,"Lab 2","R Programming Lab","The R Programming lab is used to perform practicals of Data Structures, Web Technology, Java Programming and CNN. The software's that are installed includes Ubuntu OS, Rstudio, GCC, g++ and Open JDK packages."));
        lab3.setOnClickListener(v -> openLab(R.drawable.lab3,"Lab 3","Web Technology Lab","The Web Technology lab is used to perform practicals of Web Technology, Advance C Programming, Java Programming, CNN and Domain specific mini project. The software's that are installed includes Ubuntu and Window OS, XAMPP server, Wampserver, Atom editor, Brackets editor, GCC, and Open JDK packages."));
        lab4.setOnClickListener(v -> openLab(R.drawable.lab4,"Lab 4","System Programming Lab","Laboratory for system programming and low-level software development."));
        lab5.setOnClickListener(v -> openLab(R.drawable.lab5,"Lab 5","Advanced Database System Lab","The Advance Database System Programming lab is used to perform practicals of Project I, Project II, Advance C Programming, System Programming and Database Engineering. The software's that are installed includes Ubuntu OS, MySQL, Atom editor, Brackets editor, GCC, g++ and Open JDK packages."));
        lab6.setOnClickListener(v -> openLab(R.drawable.lab6,"Lab 6","Project Lab","The Project lab is used to perform practicals of Project I, Project II, Advance C Programming, System Programming and Database Engineering. The software's that are installed includes Ubuntu OS, MySQL, Atom editor, Brackets editor, GCC, g++ and OpenJDK packages."));
        lab7.setOnClickListener(v -> openLab(R.drawable.lab7,"Lab 7","Python Programming Lab","The Python Programming lab is used to perform practicals of Compiler Construction, BDA, Operating System, Database Engineering and Compiler Construction. The software's that are installed includes Ubuntu OS, PyCharm editor, Atom editor, Brackets editor, GCC, g++ and Open JDK packages."));
        lab8.setOnClickListener(v -> openLab(R.drawable.lab8,"Lab 8","Mobile Application Development Lab","The Mobile Application Development lab is used to perform practical's of Mobile Application development, Data Structures, Java Programming, Information Security and Domain specific mini project. The software's that are installed includes Ubuntu and Window OS, Android studio, Atom editor, Brackets editor, GCC, and Open JDK packages."));
        lab9.setOnClickListener(v -> openLab(R.drawable.lab9,"Lab 9","Database Engineering Lab","The Database Engineering lab is used to perform practicals of Database Engineering, Web Technology, Java Programming, Domain specific mini project and Computer Network Laboratory. The software's that are installed includes Ubuntu OS, MySQL, MongoDB, GCC, g++ and Open JDK packages."));
        lab10.setOnClickListener(v -> openLab(R.drawable.lab10,"Lab 10","Research Lab","The Research Lab is used to perform practicals of Project I/II, Data Structures, Java Programming, Operating System and Domain specific mini project. The software's that are installed includes Ubuntu OS, Atom editor, Brackets editor, PyCharm editor, MySQL, MongoDB, GCC, and Open JDK packages."));
        lab11_new.setOnClickListener(v -> openLab(R.drawable.lab11_new,"Lab 11","C Programming Lab","The C Programming lab is used to perform practicals of C language. The software's that are installed includes Ubuntu OS, GCC, g++ ."));
        lab12_new.setOnClickListener(v -> openLab(R.drawable.lab12_new,"Lab 12","C++ Programming Lab","The C++ Programming lab is used to perform practicals of C++ language. The software's that are installed includes Ubuntu OS, GCC, g++."));
    }

    public void openLab(int image,String number,String title,String desc){

        Intent intent = new Intent(LabGridActivity.this, LabDetailActivity.class);

        intent.putExtra("image",image);
        intent.putExtra("number",number);
        intent.putExtra("title",title);
        intent.putExtra("desc",desc);

        startActivity(intent);
    }
}