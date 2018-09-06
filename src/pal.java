
public class pal {

	 
	public static void main(String[] args) {
		int[] a={121,321,433,525,124};
int n,r=0,i;
for(i=0;i<a.length;i++){
	while(a[i]>0)
	{
		n=a[i]%10;
		r=r*10+n;
		a[i]=a[i]/10;
		System.out.println(r);
		
	}
}
}
}
