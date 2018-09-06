import java.util.Random;
public class r5 {
public static void main(String[] args) {
Random r=new Random();
		int c=1;
		for(int i=1;i<=5;i++)
		{
			
			int n=r.nextInt(6)+1;
			if(n==6){
				c++;
			}
		}
			System.out.println(c);
	}
		
	}


