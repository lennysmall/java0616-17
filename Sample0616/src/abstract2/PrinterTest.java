package abstract2;

public class PrinterTest {

	
	public static void main(String[] args) {
		Man man = new Man("ȫ�浿","2342342352");
		
		Printer printer = new Printer2();
		man.setPrinter(printer);
		man.showInfo();

	}

}
