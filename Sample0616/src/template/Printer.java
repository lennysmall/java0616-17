package template;

public abstract class Printer {
	public void print(){
		printHeader();
		printBody();
		printFooter();
	}

		protected abstract void printHeader();
		protected abstract void printBody();
		protected abstract void printFooter();
}
