import java.util.Scanner;


public class str9 {

	
	public static void main(String[] args) {
		
		String s="largest word";
		    String[] rs=s.split(" ");
		    String max=rs[0];
		    for(int i=1;i<rs.length;i++)
		    {
		    	if(max.length()<=rs[i].length())
		    	{
		    		max=rs[i];
		    	
		    	}
		    }
		    
		    System.out.println(max);
	}

}
