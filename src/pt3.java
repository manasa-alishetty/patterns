import java.util.*;
public class pt3 {

	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Random r=new Random();
		System.out.print("enter the value of a:");
		int k=obj.nextInt();
		int a=0,b=0,c=0;
		for(int i=1;i<=k;i++){
			int t=r.nextInt(3)+1;
			if(t==1){
				a++;
			}
			else if(t==2){
				b++;
			}
			else if(t==3){
				c++;
			}
		}
			if(a>b){
				if(a>c){
				System.out.print("a");
			}
			else {
				System.out.print("c");
			}
			}
		
		else if(b>c){
			System.out.print("b");
		}
		else{
			System.out.print("c");
		}	
			}
			
			
		}
		
	

