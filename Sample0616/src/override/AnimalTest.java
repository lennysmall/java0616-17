package override;

public class AnimalTest {

	
	public static void main(String[] args) {
		Cat cat = new Cat("��",1);
		Dog dog = new Dog("��",2);
		Tiger tiger = new Tiger("��",10);
		RealBird bird = new RealBird("����",1);
		
		cat.speak();
		dog.speak();
		tiger.speak();
		bird.speak();
		
		Object obj = cat;
		
		if(obj instanceof Dog){  //Ÿ�Ժ�
			System.out.println("Dog or Dog subtype");
		}else
			System.out.println("is not type of Dog or Dogtype");

	}

}
