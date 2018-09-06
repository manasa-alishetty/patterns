
public class m5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 char[] v={'h','e','l','l','o'};
		
		int r=vowels(v);
		System.out.println(r);

	}
	public static int vowels(char[] v)
	{
		
		int c=0;
		for(int i=0;i<v.length;i++)
		{
			if(v[i]=='a'||v[i]=='e'||v[i]=='i'||v[i]=='o'||v[i]=='u')
			{
			c++;	
			}
			
		}
	
	
		return c;
		
		
	

}
}