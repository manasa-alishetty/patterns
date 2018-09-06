import java.util.Scanner;
public class ws22 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number");
		System.out.println("enter a number");
		int n=obj.nextInt();
		int p=obj.nextInt();
		int i,c=1;
		for(i=n;i>=1;i--){
		c=1;
		for( int j=1;j<=p;j++){
			c=i*c;
		}
		
			System.out.println(c);
			
		}
	}
}


