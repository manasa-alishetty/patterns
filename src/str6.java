import java.util.Scanner;


public class str6 {

	
	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		    System.out.print("enter  a string");
		    String s=obj.nextLine();
		    char[] rs=s.toCharArray();
		   
		    char temp;
		    for(int i=1;i<rs.length;i=i+2)
		    {
		      
		    	temp=rs[i];
		    	rs[i]=rs[i-1];
		    	rs[i-1]=temp;
		       
		    }
		    for(int i=0;i<rs.length;i++)
		    	System.out.print(rs[i]);
	}

}
