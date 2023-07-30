package com.example.emergency_care_made;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class activity_content extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataClass> dataList;
    ListAdapter adapter;
    DataClass androidData;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        recyclerView = findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.search);

        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });

        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity_content.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new DataClass("Corona Virus", R.string.corona, "Java", R.drawable.corona);
        dataList.add(androidData);

        androidData = new DataClass("Burn", R.string.burn, "Kotlin", R.drawable.burn);
        dataList.add(androidData);

        androidData = new DataClass("Asthma", R.string.asth, "Java", R.drawable.asthma);
        dataList.add(androidData);

        androidData = new DataClass("Choking", R.string.chock, "Kotlin", R.drawable.king);
        dataList.add(androidData);

        androidData = new DataClass("Bleeding", R.string.bleed, "Java", R.drawable.blood);
        dataList.add(androidData);

        adapter = new ListAdapter(activity_content.this, dataList);
        recyclerView.setAdapter(adapter);
    }

    private void searchList(String text){
        List<DataClass> dataSearchList = new ArrayList<>();
        for (DataClass data : dataList){
            if (data.getDataTitle().toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }
        }
        if (dataSearchList.isEmpty()){
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();
        } else {
            adapter.setSearchList(dataSearchList);
        }
    }
}