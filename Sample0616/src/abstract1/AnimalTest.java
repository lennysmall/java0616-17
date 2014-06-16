package abstract1;

public class AnimalTest {
	
	public void speaks(Animal animal){
		animal.speak();
	}
	
	public static void main(String[] args){
		Animal cat = new Cat();
		Animal dog = new Dog();
//		
//		Animal animal = new Animal();
//		추상클래스는 객체를 생성할 수 없다
		AnimalTest test = new AnimalTest();
		test.speaks(cat);
		test.speaks(dog);
//		override.Dog dog2 = new override.Dog("호피", 5);
		
//		test.speaks(dog2); 사용할수 없음 다른 패키지
//		cat.speak();
//		dog.speak();
	}
}
