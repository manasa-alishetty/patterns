public class mul7 {

	
	public static void main(String[] args) {
		int[] a={14,35,21,38,49};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%7==0)
			{
			System.out.println(a[i]);
			}
			if(temp<a[i])
			{
				temp=a[i];
			
		
		}
		}
		
		
		System.out.print("highest is :"+temp);
		
		

	}

}
