package override;

public class AnimalTest {

	
	public static void main(String[] args) {
		Cat cat = new Cat("코",1);
		Dog dog = new Dog("입",2);
		Tiger tiger = new Tiger("눈",10);
		RealBird bird = new RealBird("참새",1);
		
		cat.speak();
		dog.speak();
		tiger.speak();
		bird.speak();
		
		Object obj = cat;
		
		if(obj instanceof Dog){  //타입비교
			System.out.println("Dog or Dog subtype");
		}else
			System.out.println("is not type of Dog or Dogtype");

	}

}
