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
//		�߻�Ŭ������ ��ü�� ������ �� ����
		AnimalTest test = new AnimalTest();
		test.speaks(cat);
		test.speaks(dog);
//		override.Dog dog2 = new override.Dog("ȣ��", 5);
		
//		test.speaks(dog2); ����Ҽ� ���� �ٸ� ��Ű��
//		cat.speak();
//		dog.speak();
	}
}
