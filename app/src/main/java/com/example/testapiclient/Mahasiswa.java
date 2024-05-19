// Mahasiswa.java
package com.example.testapiclient;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Mahasiswa {

	@SerializedName("Mahasiswa")
	private List<MahasiswaItem> mahasiswa;

	public List<MahasiswaItem> getMahasiswa() {
		return mahasiswa;
	}
}
