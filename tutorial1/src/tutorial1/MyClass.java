package tutorial1;

interface A{
	void method1();
	void method2();

}
public class MyClass implements A{
	public void method1() {
		System.out.println("method1");
	}
	public void method2() {
		System.out.println("method2");
	}
}