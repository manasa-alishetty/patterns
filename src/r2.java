import java.util.Random;
public class r2 {
public static void main(String[] args) {
		Random r=new Random();
		int c=0;
		for(int i=1;i<=20;i++)
		{
			c=0;
			for(int j=1;j<=100;j++)
			{
				int n=r.nextInt(2);
				if(n==0)
				{
					c++;
				}
			}
					System.out.println(c);
				}
				
			
		}

		
			


}
