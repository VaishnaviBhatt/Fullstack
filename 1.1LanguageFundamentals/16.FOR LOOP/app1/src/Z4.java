class Z4
{
	public static void test(int j) 
	{
		for (int i = j; (i < 0) ; i++)
		{
			System.out.println("From if" + i);
		}
	}
		public static void main(String[] args)
		{
			test(0);
		    System.out.println("Z4 Main!");
		}
	}

class Z5
{
	public static void main(String[] args)
	{
		Z4.test(-10);
	}
}


