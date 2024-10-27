 String name = "deepak"; //depak Jgt
        String result = "";
        Set<Character> set  = new HashSet<Character>();
        
        for(int i=0;i<name.length();i++){ 
            Character c = name.charAt(i);  
            if(set.contains(c)){ 
                if(!result.contains(String.valueOf(c))){
                    result = result +c;
                }
            }
             else{
                    set.add(c);  
                }
        }
        System.out.println(result);
