package BasicJava_Practice;

public class variablTypes {

	static String name = "Deepak"; // static variable
	public String hometown = "nanded";// instance variable
	
	public void surname() {
		String surname2 = "Jagtap";
		System.out.println(surname2); // local variable
	}
	
	public void demo() {
		//cant access surname2 from demo(),
		//surname2 is only limited for surname()
		//System.out.println(surname2); 
		
		System.out.println(hometown);
	}

	public static void main(String[] args) {

		String city = "Pune";// instance variable

		variablTypes ref = new variablTypes();

		System.out.println(variablTypes.name);
		ref.surname();
		ref.demo();
		System.out.println(city);
	}
}
