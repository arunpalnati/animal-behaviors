package com.project.behaviors.animal_activities.animal.fish;

import com.project.behaviors.animal_activities.Activity;
import com.project.behaviors.animal_activities.animal.Animal;

public class Fish implements Animal{

	protected Activity activity;
	private String size;
	private String color;
	
	public Fish(Activity activity) {
		this.activity = activity;
	}
	
	public Fish(Activity activity, String size, String color) {
		this.activity = activity;
		this.size = size;
		this.color = color;
	}
	
	public void swim() {
		activity.swim();
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getSize() {
		return this.size;
	}
}
