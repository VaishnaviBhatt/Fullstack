class R 
{
	public static void main(String[] args) 
	{
		for( int i= 0; i < 10; i++)
		{
			System.out.println("Loop Begin" + i);
			if(i > 5)
			{
				break;
			}
			System.out.println("loop end (i value)" + i);
		}
		System.out.println("main end");
	}
}
