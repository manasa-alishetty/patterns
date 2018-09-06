import java.util.*;
public class r9 {

	
	public static void main(String[] args) {
	int s=0;
		Random r=new Random();
		for(int i=1;i<=5;i++){
		int n=r.nextInt(8)+1;
		s=s+n;
		}
		System.out.print(s);
		
	}

}
