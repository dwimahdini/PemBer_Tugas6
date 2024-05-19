// MahasiswaItem.java
package com.example.testapiclient;

import com.google.gson.annotations.SerializedName;

public class MahasiswaItem {
	@SerializedName("berkas")
	private Object berkas;

	@SerializedName("kategoriTA")
	private String kategoriTA;

	@SerializedName("nim")
	private String nim;

	@SerializedName("nama")
	private String nama;

	@SerializedName("calonPembimbing1")
	private String calonPembimbing1;

	@SerializedName("calonPembimbing2")
	private String calonPembimbing2;

	@SerializedName("catatan")
	private Object catatan;

	@SerializedName("tanggal")
	private String tanggal;

	@SerializedName("judul")
	private String judul;

	@SerializedName("email")
	private String email;

	@SerializedName("status")
	private String status;

	public Object getBerkas() {
		return berkas;
	}

	public String getKategoriTA() {
		return kategoriTA;
	}

	public String getNim() {
		return nim;
	}

	public String getNama() {
		return nama;
	}

	public String getCalonPembimbing1() {
		return calonPembimbing1;
	}

	public String getCalonPembimbing2() {
		return calonPembimbing2;
	}

	public Object getCatatan() {
		return catatan;
	}

	public String getTanggal() {
		return tanggal;
	}

	public String getJudul() {
		return judul;
	}

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		return status;
	}
}
