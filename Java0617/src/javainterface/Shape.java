package javainterface;
//인터페이스는 패키지 오른쪽 클릭 class 밑의 interface를 통해 생성
public interface Shape {
	public static final int i=10;
	//final은 값을 변겅할수 없는 상수값을 만든다.
	public abstract void move(int x, int y);  //abstract를 넣지 않아도 그렇게 처리됨
	public void draw(int r);
}
