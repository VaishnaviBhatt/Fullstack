class F 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		if((flag = false) && (flag = true))
		{
			System.out.println("From if");
		}
	System.out.println("End Of Main");
	System.out.println(flag);
	}	
}
