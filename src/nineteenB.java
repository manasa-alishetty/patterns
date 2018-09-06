import java.util.*;
public class nineteenB {
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a value of i");
		int i=obj.nextInt();
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
			if((100<i)&&(i<1000)){
				c=i%2;
				if(c==0){
					a=c/3;
					System.out.println(a);
				}
		
				else{
					b=c/2;
					System.out.println(b);
				}
			}
		
		   else{
				System.out.println("wrong number");
		   }
	}
}



		
