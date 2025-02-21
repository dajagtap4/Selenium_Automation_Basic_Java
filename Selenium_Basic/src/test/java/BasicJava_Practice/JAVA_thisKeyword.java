package BasicJava_Practice;

public class thisKeyword {
	int a ; //instance variable
	
	thisKeyword(){ System.out.println("no arg cons"); }
	thisKeyword(int x) {
		this(); // to invoke current class constructor
		System.out.println(x);
	}
	void demo1(int a) {
		this.a=a; // to distinguish local variable and instance variable.
		System.out.println(a);
		System.out.println("im demo1");
	}

	void demo2() {
		System.out.println("im demo2");
		this.demo1(10); // to invoke current class method
	}

	public static void main(String[] args) {
		thisKeyword ref = new thisKeyword(20);
		ref.demo2();

	}

}
