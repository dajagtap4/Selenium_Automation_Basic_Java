//Rules for creating Java constructor-
//
//Constructor name must be the same as its class name
//It must have no explicit return type, like int string.
//It cannot be abstract, static, final, and synchronized.
//
//
//
//Java Constructor  VS	Java Method
//
//used to initialize the state of an object.	
//        expose the behavior of an object.
//
//must not have a return type.	
//must have a return type.
//		
//invoked implicitly.	
//		explicitly.
//
//The Java compiler provides a default constructor if you don't have any constructor in a class.	
//not provided.
//
//name must be same as the class name.	
//The method name may or may not be same as the class name.



package BasicJava_Practice;

public class constructorPractice {

	constructorPractice() {
		System.out.println("this is no arg const...");
	}

	public static void main(String[] args) {
		constructorPractice con = new constructorPractice();
	};
};
