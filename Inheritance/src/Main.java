package inheritance;

public class Main {
		 public static void main (String[] args) {
			 Mouse1 m1= new Mouse1();
			 m1.leftClick();
			 m1.rightClick();
			 m1.scrollDown();m1.scrollUp();
			 
			
			 Mouse2 m2= new Mouse2();
			 m2.leftClick();
			 m2.rightClick();
			 m2.scrollDown();
			 m2.scrollUp();
			 m2.connect();
		 }
		}
