// MahasiswaAdapter.java
package com.example.testapiclient;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private List<MahasiswaItem> mahasiswaList;
    private Context context;

    public MahasiswaAdapter(Context context, List<MahasiswaItem> mahasiswaList) {
        this.context = context;
        this.mahasiswaList = mahasiswaList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        MahasiswaItem mahasiswa = mahasiswaList.get(position);
        holder.namaTextView.setText(mahasiswa.getNama());
        holder.nimTextView.setText(mahasiswa.getNim());
        holder.emailTextView.setText(mahasiswa.getEmail());

        // Handle item click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get selected MahasiswaItem
                MahasiswaItem selectedMahasiswa = mahasiswaList.get(holder.getAdapterPosition());

                // Start DetailActivity with selected item's data
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", selectedMahasiswa.getNama());
                intent.putExtra("nim", selectedMahasiswa.getNim());
                intent.putExtra("email", selectedMahasiswa.getEmail());
                intent.putExtra("kategori", selectedMahasiswa.getKategoriTA());
                intent.putExtra("judul", selectedMahasiswa.getJudul());
                intent.putExtra("status", selectedMahasiswa.getStatus());
                intent.putExtra("pembimbing1", selectedMahasiswa.getCalonPembimbing1());
                intent.putExtra("pembimbing2", selectedMahasiswa.getCalonPembimbing2());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        TextView namaTextView, nimTextView, emailTextView;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            namaTextView = itemView.findViewById(R.id.namaTextView);
            nimTextView = itemView.findViewById(R.id.nimTextView);
            emailTextView = itemView.findViewById(R.id.emailTextView);
        }
    }
}
