import java.util.*;
public class r10 {

	
	public static void main(String[] args) {
		
		Random r=new Random();
		for(int i=1;i<=10;i++){
		int n=r.nextInt(89)+10;
		System.out.println(n);
		if(n%11==0)
		{
			System.out.println("LOL");
		}
	}

}
}