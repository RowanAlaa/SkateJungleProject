package com.example.skatejungleproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity {

    private RecyclerView courseRV;
    private ArrayList<SkateboardModel> skateboardModelArrayList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);
        courseRV = findViewById(R.id.idRVCourse);
        skateboardModelArrayList = new ArrayList<>();
        skateboardModelArrayList.add(new SkateboardModel("Gator Skateboard","Amazing skateboard designed for young skaters (age 8-12) who want to start doing tricks: Allies, flips and grinds.", 16.99, R.drawable.skateboard7));
        skateboardModelArrayList.add(new SkateboardModel("Old School Skateboard", "Unique skateboard designed for old fashioned skaters who appreciates the old fancy look.",19.99, R.drawable.skateboard5));
        skateboardModelArrayList.add(new SkateboardModel("Hew Skateboard", "Colourful skateboard designed for Artistic skaters who love colours and patterns.", 13.99, R.drawable.skateboard6));
        skateboardModelArrayList.add(new SkateboardModel("Triangula Skateboard", "Modern skateboard designed for Modern skaters who love colours and geometrical patterns." , 20, R.drawable.skateboard20));

        // we are initializing our adapter class and passing our arraylist to it.
        SkateboardAdapter skateboardAdapter = new SkateboardAdapter(this, skateboardModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(skateboardAdapter);
    }
}
