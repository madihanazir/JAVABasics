package inheritance;

public class Mouse1 extends Mouse{ 
	String texture= "Matte black";
	public static void leftClick() {
		System.out.println("Click!");
	}
	public static void rightClick() {
		System.out.println("Click!");
	
	}

  public static void setColor(String color) {
	  System.out.println(color);
  }
  

}
