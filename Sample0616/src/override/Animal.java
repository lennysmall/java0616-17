package override;

public class Animal {
	String kind;
	String name;
	int age;
	
	public Animal(String kind, String name, int age){
		this.kind = kind;
		this.name = name;
		this.age = age;
	
	}
	
	public void speak(){
		System.out.println(kind+":");
		System.out.print(name+"("+age+") : ");
//		System.out.println("speak()");
		
	}
	
	
}
