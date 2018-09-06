import java.util.*;
public class pt4 {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
    System.out.println("enter a number");
	int n=obj.nextInt();
	int s=0,c=0,num=n,r=0,a;
	while(num!=0)
	{
	c=num%10;
	s=s+c*c*c;
	num/=10;
	}
	if(s==n){
		System.out.println("num is armstrong");
	}
	else
		System.out.println("nt armstrong");
	while(num>0){
		a=num%10;
		r=r*10+a;
		num/=10;
	}
	if(r==num)
	{
		System.out.println("palindrome");
	}
	else {
	
		System.out.println("nt palindrome");
	}
	}
		

	}


