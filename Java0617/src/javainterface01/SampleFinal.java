package javainterface01;

public class SampleFinal {
	//클래스 앞에도 final이 붙을수 있지만 이럴경우 다른 클래스에서 상속할 수 없음
	//이런식으로쓰는경우는 거의 없음
	//이 객체(클래스는 )값을 한번 지정할 수 있으며 바꿀 수는 없음.
	final int i;
	public SampleFinal(int n) {
	i = n;	//final로 선언된 field 변수는
			//생성자 안에서 한번만 값을 넣을 수 있다.
			//final로 선언되면 반드시 초기값을 주어야 함.
	}
	
	//메소드(method) 생성
	public final void showInfo(){
		System.out.println(i);
	}
	public void sayHello(){
		System.out.println("Hello world");
	}
	//final로 선언된 메소드는 재정의 할 수 없다.
	//final로 선언된 클래스는 상속할 수 없다.
	//final로 선언된 변수는 값을 수정할 수 없다.
}
