package com.project.behaviors.animal_activities;

import java.util.List;

public class CountActivity {
	
	/*Considering list of objects as we have implemented Rooster and Dolphin without inheritance 
	 otherwise can consider list of Animals*/
	private List<Object> animals;
	
	public CountActivity(List<Object> animals) {
		this.animals = animals;
	}
	
	public long count(String activity) {
		return animals.stream().filter(animal -> {
			try {
				return animal.getClass().getMethod(activity) != null;
			} catch(NoSuchMethodException exception) {
				return false;
			}
		}).count();
	}

}
