package javainterface;

public class Circle implements Shape {
	int x;
	int y;
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x+","+y+"로이동");
	}

	@Override
	public void draw(int r) {
		System.out.println(x+","+y+"에서 가로 세로 "+r+"인 원을 그림");
		
	}

}
