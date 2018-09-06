import java.util.*;
public class a6 {

	
	public static void main(String[] args) {
		int i,j,c=0,s=0,n;
		int[] a={1,2,3,4,5,6,7,8};
		for( i=1;i<a.length;i++)
		{
		 c=0;
			for( j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
			}
				if(c==2)
				{
					s=s+a[i];
				}
		}
				System.out.println(s);
			}
		}

	


