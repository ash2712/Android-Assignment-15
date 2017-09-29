package com.example.ayush.materialdesignapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //A snackbar is created on the click of the FAB
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //information is added to the arraylist
        list.add("Alpha");
        list.add("Beta");
        list.add("Cupcake");
        list.add("Donut");
        list.add("Eclair");
        list.add("Froyo");
        list.add("Gingerbread");
        list.add("Honeycomb");
        list.add("Ice Cream Sandwich");
        list.add("Jelly Bean");
        list.add("Kit kat");
        list.add("Lollypop");
        list.add("Marshmellow");
        list.add("Nougat");
        list.add("Oreo");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter adapter = new adapter(MainActivity.this,list);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        //recycleView is attached to the adapter and the LinearLayoutManager
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        //this method inflates the menu
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
}






