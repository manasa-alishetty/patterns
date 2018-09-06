import java.util.*;
public class seat {

	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int d;
		d=n%8;
		switch(n)
		{
		case 1:if(d==1 || d==4)
			System.out.println("L");
		break;
		case 2:if(d==2 || d==5)
			System.out.println("m");
		break;
		case 3:if(d==3 || d==6)
			System.out.println("u");
		break;
		case 4:if(d==0){
			System.out.println("su");
		}
		else{
			System.out.println("sl");
		}
		break;
		default:
			System.out.println("invalid number");
			
		}
		}
		
}