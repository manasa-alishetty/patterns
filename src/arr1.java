import java.util.Scanner;


public class arr1 {

	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter array size");
		int n=obj.nextInt();
		int[] a=new int[n];
		  System.out.println("enter array elements");
		  for(int i=0;i<a.length;i++){
			  a[i]=obj.nextInt();
		  }
			  System.out.println("enter element to be searched");
			  int s=obj.nextInt();
			  int flag=0;
			  for(int i=0;i<a.length;i++)
			  {
				  if(a[i]==s)
				  {
					  flag=1;
					  break;
				  }
			  }
			  if(flag==0)
			  {
				  System.out.println("not found");
			  }
			  else{
				  System.out.println("found");
			  }
				  
		  }
		  
		  

	}
