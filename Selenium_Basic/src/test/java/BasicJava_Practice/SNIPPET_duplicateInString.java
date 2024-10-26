 //REMOVE DUPLICATES FROM STRING

String name = "abbcdde";
        String result = "";
        
        for (int i = 0; i < name.length(); i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                
                if (name.charAt(i) == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
             if (!isDuplicate) {
                result += name.charAt(i);
            }
    }
    System.out.println(result);
