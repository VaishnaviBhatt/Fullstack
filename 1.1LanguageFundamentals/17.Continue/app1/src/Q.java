class Q 
{
	public static void main(String[] args) 
	{
		for( int i=0; i < 10; i++)
		{
			System.out.println("Loop Begin!");
			if(i > 5)
			{
				continue;
			}
			System.out.println("loop end");
		}
		System.out.println("Main end");
	}
}
