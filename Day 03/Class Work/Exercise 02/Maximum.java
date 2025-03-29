import java.util.Scanner;
class Maximum{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double num01 = ob.nextDouble();
		
		System.out.print("Enter the second number: ");
		double num02 = ob.nextDouble();
		
		System.out.print("Enter the third number: ");
		double num03 = ob.nextDouble();
		
		if (num01>num02 && num01>num03)
		{
			System.out.println("The Greatest number is: "+num01);
		}
		else if (num02>num03)
		{
			System.out.println("The Greatest number is: "+num02);
		}
		else
		{
			System.out.println("The Greatest number is: "+num03);
		}
	}
}