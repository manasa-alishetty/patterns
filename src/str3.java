import java.util.*;
public class str3 {

	
	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		    System.out.print("enter  a string");
		    String s=obj.nextLine();
		    //String[] rs=s.split(" ");
		    int c=0;
		    String r="";
		    for(int i=0;i<s.length();i++)
		    {
		    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		    {
		    	// r=""+s.charAt(i);
		    	if(r.indexOf(s.charAt(i))==-1)
			    {
			    	r=r+s.charAt(i)+"";
			    	
			    }
		    }
		    
		    }
		    System.out.println(r);
		    
		    
		
		   
		    }
	}




