import java.text.DecimalFormat;
class E 
{
	public static void main(String[] args) 
	{
		DecimalFormat df=new DecimalFormat(
			"#.###");
		float i=100.906f;
		System.out.println(df.format(i));
	}
}
