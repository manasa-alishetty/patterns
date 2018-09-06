
public class m3 {

	
	public static void main(String[] args) 
	{
	
          palindrome(100,200);
	}


public static void palindrome(int a,int b)
{
	int c=0,r=0, i;

	for( i=a;i<=b;i++)
	{
		int temp=i;
		r=0;
		while(temp>0)
		{
	c=temp%10;
	r=r*10+c;
	temp=temp/10;
	}
	if(r==i){
		System.out.println(r);
	}
		
	}
}}