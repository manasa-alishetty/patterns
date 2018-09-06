
public class mmax {

	
	
		public static void main(String[] args)
		{
			int[] a={3,4,5,6};
			
			int r=maxNumber(a);
			System.out.println(r);
			
			
			}
		public static int maxNumber(int[] a)
		{
			int max=0;
			for(int i=0;i<a.length;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
			}
			
				return(max);
			}
	}


