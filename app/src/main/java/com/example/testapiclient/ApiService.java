// ApiService.java
package com.example.testapiclient;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/api/mahasiswa")
    Call<List<MahasiswaItem>> getAllMahasiswa(); // Change the return type to List<MahasiswaItem>
}
