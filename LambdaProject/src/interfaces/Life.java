package interfaces;

@FunctionalInterface
public interface Life {
	public String food = "";
	public int legs = 0;

	public void living(String name, int age);
	//SAM single abstract method interface
	//Functional interface
}
