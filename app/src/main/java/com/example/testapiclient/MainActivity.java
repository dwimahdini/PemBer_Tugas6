// MainActivity.java
package com.example.testapiclient;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ApiService apiService;
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ApiService
        apiService = ApiClient.getRetrofitInstance().create(ApiService.class);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Fetch and display all Mahasiswa
        fetchAllMahasiswa();
    }

    private void fetchAllMahasiswa() {
        Call<List<MahasiswaItem>> call = apiService.getAllMahasiswa();
        call.enqueue(new Callback<List<MahasiswaItem>>() {
            @Override
            public void onResponse(Call<List<MahasiswaItem>> call, Response<List<MahasiswaItem>> response) {
                if (response.isSuccessful()) {
                    List<MahasiswaItem> mahasiswaList = response.body();
                    // Create adapter and set it to RecyclerView
                    adapter = new MahasiswaAdapter(MainActivity.this, mahasiswaList);
                    recyclerView.setAdapter(adapter);
                } else {
                    Log.e("MainActivity", "Error: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<MahasiswaItem>> call, Throwable t) {
                Log.e("MainActivity", "Failure: " + t.getMessage());
            }
        });
    }
}
