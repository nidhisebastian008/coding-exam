package com.everydayfood.model.beans;

import java.sql.Date;

public class Food extends Item{
	
	
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private boolean isVegetarian;
	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	
	
	
	
	
	

}
