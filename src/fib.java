
public class fib {

	public static void main(String[] args) {
	int a=0,b=1,c=0,i;
	for(i=1;i<7;i++)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	}

}
