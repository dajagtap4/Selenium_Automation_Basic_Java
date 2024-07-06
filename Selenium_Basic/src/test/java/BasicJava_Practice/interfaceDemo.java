package BasicJava_Practice;

interface Shape {
	int length = 10;  //final & static
	int length2 = 20;  //final & static
	
	void abstractMethod();  //abstact method
	
	default void defaultMethod() {
		System.out.println("defaultMethod");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod");
	}
}

public class interfaceDemo implements Shape{
	
	public void abstractMethod() {
		System.out.println("abstractMethod");
	}

	public void demoMethod() {
		System.out.println("abstractMethod");
	}
	public static void main(String[] args) {
		
		//Scenario 1
		interfaceDemo ref = new interfaceDemo();
		//ref.length = 200; //Error.. length is final in shape, Cant assign.
		ref.abstractMethod();
		ref.defaultMethod();
		Shape.staticMethod();
		ref.demoMethod();
		
		//Scenario 2
		Shape sh = new interfaceDemo();
		sh.abstractMethod();
		sh.defaultMethod();
		Shape.staticMethod();
		//error..below method is undefined in Shape.
		//sh.demoMethod();
	}
}
