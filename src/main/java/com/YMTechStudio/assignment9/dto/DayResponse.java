package com.YMTechStudio.assignment9.dto;

import java.util.List;

public class DayResponse {

	private List<Meals> meals;
	
	private Nutrients nutrients;
	
	public List<Meals> getMeals() {
		return meals;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	@Override
	public String toString() {
		return "DayResponse [meals=" + meals + ", getMeals()=" + getMeals() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
