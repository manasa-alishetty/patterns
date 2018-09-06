import java.util.*;
public class a19 {

	
	public static void main(String[] args) {
		int[] a={7,21,45,31};
		int b[]=new int[5];
		int k=0;
		int j;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%7==0)
			{
				k++;
				for(j=0;j<=k;j++){
				b[j]=a[i];
				}
			
				System.out.println(b[j]);
		}
			}
		}
}
	



