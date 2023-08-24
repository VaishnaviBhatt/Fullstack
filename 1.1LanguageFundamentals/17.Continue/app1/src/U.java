class U
{
	public static void main(String[] args) 
	{ 
		for( int i =0; i<2; i++)
	  {
		System.out.println("Loop Begin!" + i);
		for( int j=0; j< 5; j++)
		{
		    System.out.println("Loop2 Begin!" + "i:" + i + "j:" + j);
			if(j > 2)
			{
				continue;
			}
			System.out.println("loop2 end" + "i:" +i + "j:" + j);
		} 
		System.out.println("Loop1 end" + "i:" +i);
	}
	System.out.println("main end");
  }
}
