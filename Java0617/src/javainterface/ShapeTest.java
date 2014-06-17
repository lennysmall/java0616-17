package javainterface;

public class ShapeTest {
	public void drawShape(Shape shape, int x, int y, int r){
		//인터페이스를 불러옴
		//위의 Shape 위치에 Rectangle(클래스타입 선언)를 넣게되면 아래의
		//test.drawShape에서 rect만 사용가능. 사용제한이 걸림
		// 인터페이스는 작은 프레임워크의 개념
		shape.move(x, y);
		shape.draw(r);
		
		
	}
	
	public static void main(String[] args){
		Shape rect = new Rectangle();
		Shape circle = new Circle();
		
		ShapeTest test = new ShapeTest();
		test.drawShape(rect, 100, 100, 10);
		test.drawShape(circle, 50, 50, 30);
	
	
		

		//기본적으로 하는 방법
//		public void drawShape를 지우고 아래것을 적어도 실행가능
//		rect.move(100, 100);   
//		rect.draw(10);
//		
//		circle.move(30, 30);
//		circle.draw(5);
		
	}
}
