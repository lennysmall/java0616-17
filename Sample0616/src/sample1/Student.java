package sample1;

public class Student extends Man{
	String className;
	@Override
	public void showInfo(){
		System.out.println(name+","+resNo+","+className+","+age);
	}
	
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.resNo="34823423424";
		s.className="hybridApp";
		s.age=20;
		Man m = (Man) s;
		
		m.showInfo();

	}

}
