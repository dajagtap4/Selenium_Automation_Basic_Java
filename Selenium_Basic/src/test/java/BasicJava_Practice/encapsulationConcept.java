package BasicJava_Practice;

public class encapsulationConcept {

	private int accNu;
	private String name;
	private int balance;
	
	public int getAccNu() {
		return accNu;
	}

	public void setAccNu(int accNu) {
		this.accNu = accNu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		encapsulationConcept ref = new encapsulationConcept();
		ref.setAccNu(234567);
		ref.setName("Deepak");
		ref.setBalance(10000000);
		
		System.out.println(ref.getAccNu());
		System.out.println(ref.getName());
		System.out.println(ref.getBalance());

	}

}
