package com.example.sony.recyclerview_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sony.recyclerview_demo.adapter.ProductListAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =(RecyclerView)findViewById(R.id.recycler_view_product_list);
        recyclerView.setHasFixedSize(true);//slide cua recycler view ko thay doi trong qua trinh chay

        recyclerViewLayoutManager = new LinearLayoutManager(this);//quan li list ngang hay doc, grid, sole.....
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        List<String>list= Arrays.asList(getResources().getStringArray(R.array.product_item));

        recyclerViewAdapter = new ProductListAdapter(list);
        recyclerView.setAdapter(recyclerViewAdapter);//do du lieu vao adapter
    }
}
