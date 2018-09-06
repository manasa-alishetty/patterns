import java.util.*;
public class a16 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println(" enter the size:");
		int n=obj.nextInt();
		int[] a=new int[n];
		System.out.println(" enter all elements:");
		for(int i=0;i<a.length;i++){
			a[i]=obj.nextInt();
		}
		int c=0;
		System.out.print("enter the element:");
		int b=obj.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
			{
				c++;
			}
		}
			if(c==1){
				System.out.println("Found");
			}
			else{
				System.out.println(" not found");
			}
		}
		
		

	}


