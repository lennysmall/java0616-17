package override;

public class Tiger extends Animal{
	public Tiger(String name, int age) {
		super("north tiger", name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		super.speak();
		System.out.println("grrrr");
	}
}
