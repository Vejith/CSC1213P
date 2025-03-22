import java.util.Scanner;
class IfElse{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int a = ob.nextInt();
		
		if (a%2==0)
		{
			System.out.println("This is an even Number");
		}
		else
		{
			System.out.println("This is an odd Number");
		}
	}
}