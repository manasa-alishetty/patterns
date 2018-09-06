import java.util.*;


public class ws20 {

	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a value of n");
		int n=obj.nextInt();
		if((n>=0)&&(n<=100)){
			if((n>=90)&&(n<=100)){
				System.out.print("super smart");
			}
			else if((n>=80)&&(n<=90)){
				System.out.print("smart");
			}
			else if((n>=70)&&(n<=80)){
				System.out.print("enough");
			}
			else if((n>=60)&&(n<=70)){
				System.out.print("just smart");
			}
			else if((n>=35)&&(n<=60)){
				System.out.print("no smart");
			}
			else if((n>=0)&&(n<=35)){
				System.out.print("dump");
			}
			}
		else{
			System.out.print("invalid input");
		}
	}
}