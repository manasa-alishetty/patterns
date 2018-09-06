
public class twenty {

	public static void main(String[] args) {
		int i,j;
		for(i=100;i<=500;i++)
		{
		int n=i,c=0;
		for(j=1;j<=n;j++)
		{
			if(n%j==0)
			{
				c++;
			}	
		}
		if(c==2)
		{
			System.out.println(n);
		}
	}
}
}

	