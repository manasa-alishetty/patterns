
public class a14 {

	
	public static void main(String[] args) {
		int temp;
		int[] a={50,20,70,10,40};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
					
				{
					temp=a[j]; 
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			
		}

	}

}
