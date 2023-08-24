class V 
{
	public static void main(String[] args) 
	{
		loop1:
		for( int i =0; i < 2; i++)
		{
			System.out.println("Loop1 begin");
			if(j > 2)
			{
				continue loop1;
			}
			System.out.println("Loop2 end");
		}
		System.out.println("Loop1 end");
	}
	System.out.println("Main end");
}
