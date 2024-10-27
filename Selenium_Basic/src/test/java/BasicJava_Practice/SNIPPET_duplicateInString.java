 	String name = "Deepak";  //e
        String result = "";
        
        Set<Character> set = new HashSet<Character>();
        
        for(int i=0;i<name.length();i++){
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

        System.out.println(result);



	String name = "Deepak";    //Depak
	
	Set<Character> set = new HashSet<Character>();
	StringBuffer sf = new StringBuffer();

	for(int i=0;i<str.length();i++) {
	    Character c = str.charAt(i);

		if(!set.contains(c)) {
		  set.add(c);
		  sf.append(c);
		}//if
		
	  }//for
	System.out.println(sf);
