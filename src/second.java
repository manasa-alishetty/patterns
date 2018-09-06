import java.util.Scanner;
public class second {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a number");
	int n=obj.nextInt();
	int h=0,sh=0,t;
	 while(n!=0){
		t=n%10;
		n=n/10;
		if(t==h){
			h=t;
		}
		else if(t>h){
			sh=h;
			h=t;
		}
		else if(t>sh){
			sh=t;
		}
	 }
		System.out.println(sh);
	 }
}

		    