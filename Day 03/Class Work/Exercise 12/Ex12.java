import java.util.Scanner;
class Ex12{
	public static void main (String [] args)
	{
		Scanner ob =  new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		int a = ob.nextInt();
		
		System.out.print("Enter the 2nd number: ");
		int b = ob.nextInt();
		
		if (a>b)
		{
			System.out.println("The 1st number is maximum");
		}
		else
		{
			System.out.println("The 2nd number is maximum");
		}
	}	
}