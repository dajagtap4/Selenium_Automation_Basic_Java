import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int[] array = {1,2,2,0,4,0,3};
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates =  new HashSet<>();
        
        for(int element : array){
            if(!set.add(element)){
            duplicates.add(element);
            }
        }
        System.out.println(duplicates);
    }
}
