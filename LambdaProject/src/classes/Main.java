package classes;

import interfaces.Life;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Human man = new Human();


		
		Life puppy = (name,age) -> {
			System.out.println("im a dog, my name is "+name);
			System.out.println("im "+age+" months old");
			dog.eatingHabits();
			System.out.println("fight with cats");
		};

		Life human = (name, age)->{
			System.out.println("Partying");
		};
		
		puppy.living("mani", 6);
		System.out.println();
		human.living("vishnu",16);
		System.out.println();
			
	}

}
