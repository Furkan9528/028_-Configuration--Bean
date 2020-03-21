package com.furkankara;

import org.springframework.beans.factory.annotation.Required;

public class Ogrenci {

	
	private String adi, soyadi;
	
	private Sehir sehir;
	
	
	
	public Sehir getSehir() {
		return sehir;
	}
	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}
	//----------------------------------
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//----------------------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	
	
}
