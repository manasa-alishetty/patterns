
public class ones {

	public static void main(String[] args) {
		int c=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=6;j++){
				if(c%2!=0){
					System.out.print(1);	
				}
				
				else{
					System.out.print(0);
					
				}
				c++;
				
			}
			System.out.println();
			
			c++;
		}

	}

}
