
public class Demo
{
	public static void main(String[] args) {
    
	   String string1 = "AirShopping.CoreQuery.OriginDestinations.OriginDestination.AirPort";
	   String[] string2 = string1.split("\\.");
	    
	   String indexWord = string2[string2.length-1]; // string2[4]
	   System.out.println(indexWord);
    
	}
}

//AirPort
