
public class d4 {

	
	public static void main(String[] args) {
		int c=4,a=10;
		for(int i=1;i<=4;i++){
			for(int k=1;k<=c;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(" "+a);
				a=a+10;
				
			}
			System.out.println();
			c--;
		}

	}

}
