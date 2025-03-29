import java.util.Scanner;
class NestedForLoop{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the value for Counter 01: ");
		int Counter01 = ob.nextInt();
		System.out.print("Enter the value for Counter 02: ");
		int Counter02 = ob.nextInt();
		
		for (int i=0; i<Counter01; i++)
		{
			System.out.println("Value for i: "+i);
			
			for (int j=0; j<Counter02; j++)
			{
				System.out.print(" Value for j: "+j+" ");
			}
			
			System.out.println();
		}
	}
}