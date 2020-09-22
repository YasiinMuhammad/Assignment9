package com.YMTechStudio.assignment9.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.YMTechStudio.assignment9.dto.DayResponse;
import com.YMTechStudio.assignment9.dto.WeekResponse;

@RestController
public class MealPlannerCotroller {

	@GetMapping("mealplanner/week/")

	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions, String week) {
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", "week")
				.queryParam("apiKey", "ec16e224a07f42cebb06e72839b059f0")
				.queryParam("diet", diet)
				.queryParam("numCalories", Integer.parseInt(numCalories))
				.queryParam("exclude", exclusions)
				.build()
				.toUri(); 
		RestTemplate rTemplate = new RestTemplate();
		return rTemplate.getForEntity(uri, WeekResponse.class);

	}
 
	@GetMapping("mealplanner/day")

	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions, String timeFrame) {

		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				.queryParam("timeFrame", timeFrame)
				.queryParam("apiKey", "ec16e224a07f42cebb06e72839b059f0")
				.queryParam("diet", diet)
				.queryParam("numCalories", Integer.parseInt(numCalories))
				.queryParam("exclude", exclusions)
				.build()
				.toUri();
		RestTemplate rTemplate = new RestTemplate();
		return rTemplate.getForEntity(uri, DayResponse.class);

	}
}
