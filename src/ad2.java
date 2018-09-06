
public class ad2 {

	
	public static void main(String[] args) {
		int temp=0,n=0,s=0;
		int[] a={31,14,71};
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			while(a[i]!=0){
				n=a[i]%10;
				if(n%2!=0)
				{
					s=s+n;
				}
			     a[i]=a[i]/10;
			}
		}
		
		System.out.print(s);
		}
	

}
