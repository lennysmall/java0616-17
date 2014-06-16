package override;

public class Dog extends Animal{
	public Dog(String name, int age){
		super("mix",name, age);
	}
	
	@Override
	public void speak() {
		super.speak();
		System.out.println("bow-wow");
	}
}
