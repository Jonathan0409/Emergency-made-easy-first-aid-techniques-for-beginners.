package com.example.emergency_care_made;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class prepare extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataClass> dataList;
    ListAdapter adapter;
    DataClass androidData;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare);

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

        GridLayoutManager gridLayoutManager = new GridLayoutManager(prepare.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new DataClass("Tsunami", R.string.camera, "Java", R.drawable.tsunami);
        dataList.add(androidData);

        androidData = new DataClass("Typhoon", R.string.recyclerview, "Kotlin", R.drawable.typhoon);
        dataList.add(androidData);

        androidData = new DataClass("Earthquake", R.string.date, "Java", R.drawable.earthquake);
        dataList.add(androidData);

        androidData = new DataClass("Volcano eruption", R.string.edit, "Kotlin", R.drawable.vc);
        dataList.add(androidData);

        androidData = new DataClass("Fire", R.string.rating, "Java", R.drawable.fire);
        dataList.add(androidData);

        adapter = new ListAdapter(prepare.this, dataList);
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