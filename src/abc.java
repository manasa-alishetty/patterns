
public class abc {

	
	public static void main(String[] args) {
		int n=354,r=0,c=0;
		while(n>0)
		{
			c=n%10;
			r=r*10+c;
			n=n/10;
		}
		System.out.println(r);
		

	}

}
