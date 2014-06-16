package template;

public class Printer1 extends Printer {
	String contents;
	public Printer1(String contents){
		this.contents = contents;
	}
	

	@Override
	protected void printHeader() {
		System.out.println("templet pattern sample");
		System.out.println("=================================");
		
	}

	@Override
	protected void printBody() {
		System.out.println(contents);
		
	}

	@Override
	protected void printFooter() {
		System.out.println("==============================");
		System.out.println("³¡");
		
	}



}
