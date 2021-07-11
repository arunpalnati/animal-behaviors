package com.project.behaviors.animal_activities;

import java.util.Arrays;
import java.util.List;

import com.project.behaviors.animal_activities.animal.bird.Chicken;
import com.project.behaviors.animal_activities.animal.bird.Duck;
import com.project.behaviors.animal_activities.animal.bird.Parrot;
import com.project.behaviors.animal_activities.animal.bird.Rooster;
import com.project.behaviors.animal_activities.animal.fish.Dolphin;
import com.project.behaviors.animal_activities.animal.fish.Fish;
import com.project.behaviors.animal_activities.animal.insect.Butterfly;
import com.project.behaviors.animal_activities.animal.insect.Caterpillar;
import com.project.behaviors.animal_activities.animal.mammal.Cat;
import com.project.behaviors.animal_activities.animal.mammal.Dog;

public class Solution {
	
	public static void main(String[] args) {
		Activity activity = new Activity();
		Parrot parrot = new Parrot(new Dog(activity), activity);
		parrot.sing();
		parrot = new Parrot(new Cat(activity), activity);
		parrot.sing();
		parrot = new Parrot(new Rooster(activity), activity);
		parrot.sing();
		
		Fish fish = new Fish(activity);
		
		List<Object> animals = Arrays.asList(new Cat(activity), new Butterfly(activity),
				new Caterpillar(activity), new Chicken(activity), new Duck(activity),
				fish, new Rooster(activity), new Dog(activity),
				 new Dolphin(fish));
		
		CountActivity countActivity = new CountActivity(animals);
		System.out.println("Number of Animals can fly "+ countActivity.count("fly"));
		System.out.println("Number of Animals can walk "+ countActivity.count("walk"));
		System.out.println("Number of Animals can sing "+ countActivity.count("sing"));
		System.out.println("Number of Animals can swim "+ countActivity.count("swim"));
	}

}
