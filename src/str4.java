import java.util.*;
public class str4 {

	
	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		    System.out.print("enter  a string");
		    String s=obj.nextLine();
		    //String[] rs=s.split(" ");
		    int c=0;
		    for(int i=0;i<s.length();i++)
		    {
		    	for(int j=i+1;j<s.length();j++)
		    	{
		    		if(s.charAt(i)==s.charAt(j))
		    		{
		    		c++;
		    		System.out.println(s.charAt(i)+" ");
		    		}
		    	}
		    }System.out.println(c);
	}
}

