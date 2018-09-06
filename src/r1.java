import java.util.*;
public class r1 {

	public static void main(String[] args) {
		
		
		Random r=new Random();
		int c=0,k=0;
		for(int i=1;i<=10;i++){
			int n=r.nextInt(2);
			if(n==0){
				c++;
			}
			else if(n==1){
				k++;
			}

		}
		System.out.print(c+","+k);
		
	}

}
