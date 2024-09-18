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


//In Java, a constructor is a special method that is called when an object is instantiated. 
//It has the same name as the class and does not have a return type. Constructors are primarily used to initialize objects.


class Dog {
    String name;
    int age;

    // Default Constructor
    public Dog() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display dog details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class constructorPractice {
    public static void main(String[] args) {
        // Using the default constructor
        Dog dog1 = new Dog();
        dog1.display(); // Output: Name: Unknown, Age: 0

        // Using the parameterized constructor
        Dog dog2 = new Dog("Buddy", 3);
        dog2.display(); // Output: Name: Buddy, Age: 3
    }
}



// Key Points
	
// Constructors and Class Name: Constructors must have the same name as the class.
// No Return Type: Constructors do not have a return type, not even void.
// Overloading: You can have multiple constructors in a class (constructor overloading) with different parameters.
// Implicit Call: The default constructor is called implicitly if no constructor is defined.

constructors in Java cannot be static. 
Constructors are special methods that are invoked when an instance of a class is created. 
Their primary purpose is to initialize the newly created object, and since static methods belong to the class itself 
rather than to any specific instance, it wouldn't make sense for a constructor to be static.

class Example {
    static int staticVariable;

    // Static block
    static {
        staticVariable = 10;
        System.out.println("Static block executed.");
    }

    // Constructor
    public Example() {
        System.out.println("Constructor executed.");
    }

    public void display() {
        System.out.println("Static Variable: " + staticVariable);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();
        obj1.display();

        Example obj2 = new Example();
        obj2.display();
    }
}

// Static block executed.
// Constructor executed.
// Static Variable: 10
// Constructor executed.
// Static Variable: 10

// The static block is executed when the class is loaded, initializing staticVariable.
// The constructor is executed each time a new instance of the Example class is created.
