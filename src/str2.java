import java.util.*;
public class str2 {


	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		    System.out.print("enter  a string");
		    String rev =""; 
		    String s=obj.nextLine();
		    for(int i=s.length()-1;i>=0;i--)
		    {
		    	rev=rev+s.charAt(i);
		    }
		    	if(s.equals (rev))
		    	{
		    		System.out.println("palindrome");
		    	}
		    	else
		    	{
		    		System.out.println("not a palindrome");
		    	}
		    }

	}

