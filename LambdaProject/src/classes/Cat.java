package classes;

import interfaces.Life;

public class Cat implements Life{
	
	int legs = 4;
	String food = "fish";

	public void speak() {
		System.out.println("MEOW");
	}

	@Override
	public void living(String name, int age) {
		System.out.println("make noise");
		System.out.println("play with owner");
	}
}
