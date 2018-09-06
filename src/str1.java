import java.util.*;
public class str1 {

	
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    System.out.print("enter  a string");
	    String s=obj.nextLine();
	    String[] rs=s.split(" ");
	   for(int i=rs.length-1;i>=0;i--)
	    {
	    	System.out.print(rs[i]+" ");
	    }
	}

}
