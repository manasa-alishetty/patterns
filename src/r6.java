import java.util.Random;
public class r6 {

	
	public static void main(String[] args) {
		Random r=new Random();
		int c=1;
		for(int i=1;i<=100;i++){
			int a=r.nextInt(6)+1;
			int b=r.nextInt(6)+1;
			if(a==1&&b==1){
				c++;
			}
			
		}
		System.out.println(c);
		

	}

}
