class HelloWorld {
    public static void main(String[] args) {
		String name = "madam";
		
    	int start = 0;
    	int end = name.length()-1;
	    
	    while(start<end){
	       if(name.charAt(start)!=name.charAt(start)){
	            System.out.println( "not a palindrome.");
	       }
	        start++;
            end--;
	    }
	      System.out.println("palindrome.");
    }
}
