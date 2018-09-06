import java.util.*;
public class gamedouble {

	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		
		int c=0;
		System.out.println(" enter first number");
		int n=obj.nextInt();
		
			while(true)
			{
				int m=obj.nextInt();
			
			if(2*n==m)
			{
				c++;
			   
			    
			}
			
			
			else
			{
				break;
			}
			n=m;
			}
			
			System.out.print(c);
		}
		}
	


