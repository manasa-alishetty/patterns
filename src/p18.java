
public class p18 {

	
		public static void main(String[] args) {
			int c=5,s=0;
			for(int i=1;i<=4;i++){
				for(int j=1;j<=i;j++){
					
					System.out.print(c);
					s=s+c;
			c=c+2;
				}
					System.out.print("@");
					System.out.print(s);
					System.out.print("-");
					
					if(i%2==0){
						System.out.print("even");
					}
					else{
						System.out.print("odd");
					}
					s=0;
				System.out.println();
			}
		}

	

	}



