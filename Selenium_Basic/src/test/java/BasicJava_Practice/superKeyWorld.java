//super can be used to refer immediate parent class instance variable,
//													         method,
//													         Cunstructor.

package BasicJava_Practice;

class parentClass {

	String name = "Deepak";
}

class child extends parentClass {
	String name = "jagtap";
	
	public void printName() {
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class superKeyWorld {
	public static void main(String[] args) {
		child ch = new child();
		ch.printName();
	}
}
