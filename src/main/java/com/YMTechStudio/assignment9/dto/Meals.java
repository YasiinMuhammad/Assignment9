package com.YMTechStudio.assignment9.dto;

public class Meals {

	Integer id;
	String title;
	Integer readyInMinutes;
	Integer servings;
	String imageType;
	String sourceUrl;

	@Override
	public String toString() {
		return "Meals [id=" + id + ", title=" + title + ", readyMinuets=" + readyInMinutes + ", servings=" + servings
				+ ", imageType=" + imageType + ", sourceUrl=" + sourceUrl + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

}
