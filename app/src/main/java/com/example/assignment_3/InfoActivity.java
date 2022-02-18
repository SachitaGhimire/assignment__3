package com.example.assignment_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class InfoActivity extends AppCompatActivity {

    private RecyclerView recycle;

    private String[] name = {"Sarmila","Shirisha","RukuMaya","Roshan","Rabin", "Prakash","Ishwori",
            "Sarmila","Shirisha","RukuMaya","Roshan","Rabin", "Prakash","Ishwori"};
    private String[] address= {"Sinamangal","Koteshwor","Gaushala", "Baneshwor","Tinkune","Maitidevi","chabahil",
            "Sinamangal","Koteshwor","Gaushala", "Baneshwor","Tinkune","Maitidevi","chabahil"};
    private String[] faculty = {"BBA","BBM","BBS","BSW","CSIT","BCA","BIM",
                                "BBA","BBM","BBS","BSW","CSIT","BCA","BIM"};
    private String[] semester = {"1","2","3","4","5","6","7","8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().hide();
        recycle = findViewById(R.id.rv);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setAdapter(new CustomAdapter(this,name,address,faculty,semester));

    }
}

