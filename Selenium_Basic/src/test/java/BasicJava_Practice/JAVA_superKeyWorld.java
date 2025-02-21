//super can be used to refer immediate parent class instance variable,

// Superclass
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Calling the superclass constructor
    }

    // Overriding the sound method
    @Override
    public void sound() {
        super.sound(); // Calling the superclass method
        System.out.println(name + " barks.");
    }

    public void display() {
        System.out.println("Dog's name is: " + super.name); // Accessing superclass field
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();  // Output: Animal makes a sound. Buddy barks.
        dog.display(); // Output: Dog's name is: Buddy
    }
}


Example 2 -

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


Key Uses of super
Accessing Superclass Methods: When a method in a subclass overrides a method in its superclass, you can use super to call 
the superclass's method.

Accessing Superclass Constructors: The super keyword can be used to invoke a superclass constructor. This is often necessary 
when you want to initialize fields inherited from the superclass.

Accessing Superclass Fields: If a subclass has a field with the same name as a field in its superclass, you can use super 
to differentiate between them.




