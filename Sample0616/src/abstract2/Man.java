package abstract2;

public class Man {
	String name;
	String resNo;
	Printer printer;
	public Man(String name, String resNo){
		this.name = name;
		this.resNo = resNo;
		
	}
	
	public void setPrinter(Printer printer){
		this.printer = printer;
	}
	
	public void showInfo(){
		if(printer == null){
			//printer상속한 클래스의 객체가 없다면
			System.err.println("프린터가 지정되지 않았습니다.");
			//이스케이프문자열 색장지정 코드가 있음. 출력문앞에 삽입하면 
			//배경 글자색각 지정가능  시작과 끝을 정확하게 지정해야함
			return;	
		}printer.print(name, resNo);
	}

}
