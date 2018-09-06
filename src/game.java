import java.util.*;

public class game {
public static void main(String[] args) {
	Random r=new Random();
	int c=0,n=20,i;
	for(i=1;i<=100;i++)
	{
		 i=r.nextInt(2);
		 if(i==0){
			 c++;
		 }
	
		 if(c>=60){
			 System.out.println(n+20);
		 }
		 else{
			 System.out.println(n-1);
			 
		 }
		
		
	}
}
		
	}


