
public class median {

	public static void main(String[] args) {
		int[] a={10,30,60,40,50,20};
		int temp=a[0];
		int i;
		for( i=0;i<a.length-1;i++)
		{
			for(int j=i;i<a.length-1;i++)
			{
			if(temp>a[i])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.print(temp);
	}
	}
	


