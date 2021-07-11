package com.project.behaviors.animal_activities.animal.fish;

public class Dolphin {
	
	private Fish fish;
	
	public Dolphin(Fish fish) {
		this.fish = fish;
	}
	
	public void swim() {
		fish.swim();
	}

}
