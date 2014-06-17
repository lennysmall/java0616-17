package javainterface;
//implements 뒤에는 여러개를 받을 수 있음, 기본적으로 인터페이스는 여러개를 구현할 수 있기때문
//추상메소드는 반드시 구현
//클래스를 만들때 화면내의 인터페이스를 지정해서 바로 상속 받을 수 있음
public class Rectangle implements Shape{
	int x;
	int y;
	 
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x+" "+y+"로 이동");
		
	}

	@Override
	public void draw(int r) {
		System.out.println(x+","+y+"에서 가로 세로 "+r+"인 사각형을 그림");
		
	}

}
