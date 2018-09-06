
public class m6 {

	
	public static void main(String[] args) {
        int[] a={10,40,30,20};
		Sorting(a);
		
	}
	public static void  Sorting(int[] a)
	{
		int temp=0;
	
		for(int i=0;i<a.length;i++)
		{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
	}

	
	
		
		
		
		




