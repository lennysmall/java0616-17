package javainterface01;

public class SampleChild extends SampleFinal {

		
	public SampleChild() {
		super(10);
		
	}

		
	//say 적고 컨트롤 엔터로 오버라이드 sayahello 호출
	@Override
	public void sayHello() {
		super.sayHello();
	}
}
//	@Override
//	public void showInfo(){}
//}

