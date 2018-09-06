import java.util.Scanner;


public class str8 {

	
	public static void main(String[] args) {
		int c=0;
		
	    Scanner obj=new Scanner(System.in);
	    System.out.print("enter  a string");
	    String s=obj.nextLine();
	    String[] rs=s.split(" ");
	    for(int i=0;i<rs.length;i++)
	    {
	    	c=0;
	    	for(int j=i+1;j<rs.length;j++)
	    	{
	    		if(rs[i].equals(rs[j]))
	    		{
	    			c++;
	    		}
	    	
	    	
	    	}
	System.out.print(c);
	}
	}
}