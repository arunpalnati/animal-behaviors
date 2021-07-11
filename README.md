# animal-behaviors
This project is to demonstrate animal and their behaviors

Frameowrk/Language
Java
SpringBoot
Mockito


Creating Animal is an interface without any methods
  -> Animal is a type, not an object/living thing so created it as an interface
  -> There is no common behavior between animals, some can fly, walk, few cannot ant etc..
  
Created Bird as abstract calss
  -> Bird is also an abstract, there is no real existence
 
Created Activity class to perform all the activities such as fly, walk, swim, etc..
 -> This class is created to make the reusability of code, and create without duplicate code

Created Chicken, Duck as Bird family of animals and extended with Bird abstract clss to inherit common behaviors

Rooster implemented with has a relationship using Activity class (Avoided inheritance as per the given requirement)

Implemented test cases for abstract class Bird also, using mockito

Fish Family animals implemented and Dolphin implemented without inheritance 

Mammals added for Parrot testing

Parrot implemented with special singig quality, whichver Animal/object passed while instantiatiing, parrot will get its singing behavior. (This is extendible for any type of object)
 -> Used reflection, Object and Class class API
 
CountActivity class implemented to find the number of animals have same behavior such as fly, walk, sing, swim
 -> Here streams, collections, Class class API are used to calculate the count
 
 This is simple spring boot app with plain java classes, will add rest endpoint later when I have some more time and included Mockito test framework
