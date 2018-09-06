
public class M7 {

	
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,45};
		int b[]={6,7,8,9,15};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			System.out.print(c[i]);
		}
		int k=0;
		for(int j=a.length;j<c.length;j++)
		{
			c[j]=b[k];
			k++;
			System.out.print(c[j]);
		}
		/*for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]);
		}*/
		
		
		
	}

}
