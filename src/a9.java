
public class a9 {

	public static void main(String[] args) {
		int temp=0;
		int[] a={8,7,5,1,5,2,6};
		if(a.length%2==0){
		for(int i=0;i<a.length;i=i+2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		}
		else{
		for(int i=0;i<a.length-2;i=i+2)
		{

			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		}
		for( int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}

	}

}
