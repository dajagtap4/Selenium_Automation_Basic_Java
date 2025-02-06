import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        String name = "Deepak";  //e
        String result = "";
        
        Set<Character> set = new HashSet<Character>();
        
        for(int i=0;i<name.length();i++)
        {
            Character c = name.charAt(i);
            
            if(set.contains(c))
	     {
                 if(!result.contains(String.valueOf(c)))
		 {
                      result = result + c;
                 }
             }//1st if
	          else
	             {
                       set.add(c);
                     }//else
        }//for
        
        System.out.println(result);// Output will be 'e'
    }
}
