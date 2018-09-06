
public class ad1 {

	
	public static void main(String[] args) {
		int[] a={121,321,33,525,12};
		int n,r=0,c=0,i,s=0,k=0,temp=0;
		for( i=0;i<a.length;i++)
		{
			r=0;
			temp=a[i];
			while(a[i]!=0){
			n=a[i]%10;
			r=r*10+n;
			a[i]=a[i]/10;
			}
		
		        if(temp==r){
				s=s+temp;
				k++;
			}
		}
			
			System.out.println(s/k);
			}
		}

		
		
		
		
	

