package override;

public class Cat extends Animal{
	public Cat(String name, int age){
		super("ko-short",name, age);
	}
	
	@Override
	public void speak() {
		super.speak();
		System.out.println("meow");
		
	}
}
