package classes;

import interfaces.Life;

public class Human implements Life{

	@Override
	public void living(String name, int age) {
		
		System.out.println("go to school");
		System.out.println("buy food");
		System.out.println("build using concrete");
		
	}

}
