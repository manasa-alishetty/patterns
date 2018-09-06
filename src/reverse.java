import java.util.*;
public class reverse {

	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=123,r=0,c=0;
		while(n>0)
		{
		c=n%10;
		r=r*10+c;
		n=n/10;
		}
		System.out.print(r);
	}
}
