class D 
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((i++ == 1) && (i++ == 1))
		{
			System.out.println("From if");
			i++;
		}
		System.out.println("End Of Main!");
		System.out.println(i);
	}
}
