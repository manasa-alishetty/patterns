import java.util.Scanner;

public class coffee {

	public static void main(String[] args) {
		System.out.println("MENU");
		System.out.println("enter 1 for coffee");
		System.out.println("enter 2 for cold coffee");
		Scanner obj=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=obj.nextInt();
		if(n==1)
		{
			System.out.println(" coffee");
		
		}
		else if(n==2){
			System.out.println("cold1 coffee");
		}
		

	}

}
