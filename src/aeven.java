import java.util.*;
public class aeven {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int[] a=new int[3];
		
		System.out.println(" enter all elements:");
		for(int i=0;i<a.length;i++)
		{
			
			
				a[i]=obj.nextInt();
				if(a[i]%2!=0)
				{
					System.out.println("print even numbers");
				}
			
			
		}

	}

}
