
public class p17 {

	
	public static void main(String[] args) {
		int c=1,s=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				
				System.out.print(c);
				s=s+c;
		c=c+1;
			}
				System.out.print("-");
				System.out.print(s);
				s=0;
			System.out.println();
		}
	}

}
