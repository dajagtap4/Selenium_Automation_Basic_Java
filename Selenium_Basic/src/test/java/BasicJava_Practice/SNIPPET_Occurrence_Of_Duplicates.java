import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
       String name = "Deepak";  
       String duplicates = "";
       
       Map<Character, Integer> map = new HashMap<>();
       for(int i = 0; i < name.length(); i++)
       {
            Character c = name.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
       }
       
       for(int i = 0; i < name.length(); i++)
       {
            Character c = name.charAt(i);
            if (map.get(c) > 1 && !duplicates.contains(String.valueOf(c))) {
                duplicates += c;
            }
       }
       
       for(Character c : duplicates.toCharArray())
       {
                System.out.println(c + " = "+ map.get(c));
       }
    }
}
