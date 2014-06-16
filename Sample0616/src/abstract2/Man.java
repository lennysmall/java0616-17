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
			//printer����� Ŭ������ ��ü�� ���ٸ�
			System.err.println("�����Ͱ� �������� �ʾҽ��ϴ�.");
			//�̽����������ڿ� �������� �ڵ尡 ����. ��¹��տ� �����ϸ� 
			//��� ���ڻ��� ��������  ���۰� ���� ��Ȯ�ϰ� �����ؾ���
			return;	
		}printer.print(name, resNo);
	}

}
