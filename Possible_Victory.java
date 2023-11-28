class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int o =s.nextInt();
		int c = s.nextInt();
		
		int needover = 20-o;
		int runneed = r-c;
		int canscore = needover*6*6;
		
		if(canscore>runneed)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}