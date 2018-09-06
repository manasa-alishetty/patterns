import java.util.*;
public class prime {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number");
	
	int n=obj.nextInt();
	int c=0;
	for(int i=1;i<=n;i++)
	{
		c=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				c++;
				//break;
		}
			
		}

		if(c==2){
		System.out.println(i);
	}
	}
}
}


