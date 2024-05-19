// DetailActivity.java
package com.example.testapiclient;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get data passed from MainActivity
        String nama = getIntent().getStringExtra("nama");
        String nim = getIntent().getStringExtra("nim");
        String email = getIntent().getStringExtra("email");
        String kategori = getIntent().getStringExtra("kategori");
        String judul = getIntent().getStringExtra("judul");
        String status = getIntent().getStringExtra("status");
        String pembimbing1 = getIntent().getStringExtra("pembimbing1");
        String pembimbing2 = getIntent().getStringExtra("pembimbing2");

        // Populate TextViews with data
        TextView namaTextView = findViewById(R.id.textViewNama);
        TextView nimTextView = findViewById(R.id.textViewNim);
        TextView emailTextView = findViewById(R.id.textViewEmail);
        TextView kategoriTextView = findViewById(R.id.textViewKategori);
        TextView judulTextView = findViewById(R.id.textViewJudul);
        TextView statusTextView = findViewById(R.id.textViewStatus);
        TextView pembimbing1TextView = findViewById(R.id.textViewPembimbing1);
        TextView pembimbing2TextView = findViewById(R.id.textViewPembimbing2);

        namaTextView.setText(nama);
        nimTextView.setText(nim);
        emailTextView.setText(email);
        kategoriTextView.setText(kategori);
        judulTextView.setText(judul);
        statusTextView.setText(status);
        pembimbing1TextView.setText(pembimbing1);
        pembimbing2TextView.setText(pembimbing2);
    }
}
