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


It is a way to achieve abstraction and multiple inheritance. 

Interfaces can declare methods without providing their implementation. 
Classes that implement the interface must provide implementations for all of its methods.

A class can implement multiple interfaces

All variables declared in an interface are implicitly public, static, and final.

Starting from Java 8, interfaces can also contain default methods (with a body) and static methods.

Interfaces cannot be instantiated directly and do not have constructors.


Benefits of Using Interfaces
Abstraction: Interfaces provide a way to define abstract types that can be implemented by any class,
	promoting loose coupling and flexibility.

Multiple Inheritance: Unlike classes, which can only inherit from one superclass, a class can implement multiple interfaces, 
	allowing for greater flexibility.

Polymorphism: Interfaces enable polymorphism, allowing methods to use parameters of the interface type, 
        enabling different implementations to be passed.

Separation of Concerns: They help separate the definition of methods from their implementations, 
	leading to cleaner and more maintainable code.




TypeScript Interface 

interface I1{
  a:number
  b:number
  sum():number
}

interface I2 extends I1{
  x:number
  y:number
  sub():number
}

class C1 implements I2{
  a:number
  b:number
  x:number
  y:number
  
  sum():number{
    return (this.a+this.b)
  }
   
  sub():number{
    return (this.x-this.y)
  }
}

var c=new C1()
c.a=10
c.b=20
c.x=30
c.y=40
console.log(c.sum())
console.log(c.sub())
