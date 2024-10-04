class HelloWorld {
    public static void main(String[] args) {
        String name = "Deepak jagtap";
        char [] ch = name.toCharArray();
      
        for( int i = 0; i < ch.length ; i++ ) {
           if( ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o'&& ch[i] != 'u' ) {
                 System.out.print( ch[i] );
            }
        }
    }
}

  //simplest way using string ()
  //System.out.println(name.replaceAll("[aeiouAEIOU]", ""));
      
