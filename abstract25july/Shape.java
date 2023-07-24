package abstract25july;

abstract class Shape {
	int a=10;
	int b=20;
	abstract void printArea();
	public static void main (String args[]) {
		Rectangle r= new Rectangle();
		Triangle t= new Triangle();
		Circle c= new Circle();
		r.printArea();
		t.printArea();
		c.printArea();
		
	}

}

