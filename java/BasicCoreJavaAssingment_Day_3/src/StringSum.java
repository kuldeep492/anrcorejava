
public class StringSum {
	public static void sum()
	{
		String string="12345";
		int sum=0;
		int i=0;
		int index=0;
		for(i=string.length()-1;i>=0;i--)
		{
			sum+=Character.getNumericValue((string.charAt(string.length()-i-1)));
		}
		/*for(int j=0;j<=string.length()-1;j++)
		{
			System.out.println(string.concat(string));
			
		}*/
		//System.out.print("The sum of digit = "+string.concat(string)+" + " +sum);
		
	}

}
