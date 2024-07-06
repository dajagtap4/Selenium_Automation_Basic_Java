package DemoPackage;

import org.testng.annotations.Test;

public class amazonDemo{
	
	@Test
	public void amazonTest() {
		 String name = "deepak ashokrao jagtap";
	        char[] ch = name.toCharArray();
	        
	        for(int i=0;i<ch.length;i++)
	        {
	            for(int j=i+1;j<ch.length;j++)
	            {
	            	int count = 0;
	                if(ch[i]==ch[j])
	                {
	                    System.out.println(ch[j]);
	                    count++;
	                }
	            }
	        }
		}
}
