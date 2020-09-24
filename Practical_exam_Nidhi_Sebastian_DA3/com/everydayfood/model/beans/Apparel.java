package com.everydayfood.model.beans;

public class Apparel extends Item{
	
	String size;
	String material;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Apparel(String size, String material) {
		super();
		this.size = size;
		this.material = material;
	}

}
