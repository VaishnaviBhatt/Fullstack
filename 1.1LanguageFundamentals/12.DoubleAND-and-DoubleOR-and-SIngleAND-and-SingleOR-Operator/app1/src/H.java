class H 
{
	public static void main(String[] args) 
	{
		int i=0;
		if((i++ == 0) || (i++ == 1))
		{
			System.out.println("From if");
			i++;
		}
		System.out.println("End of Main!");
		System.out.println(i);
	}
}
