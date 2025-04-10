import java.util.Scanner;
class Ex03{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		int arr [] = new int [10];
		
		for (int i=0; i<10; i++)
		{
			System.out.print("Enter a number: ");
			arr[i] = ob.nextInt();
		}
		System.out.println("The elements of the array");
		for (int i=0; i<10; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
		
		String days [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for (String day:days)
		{
			System.out.print(day+ "\t");
		}
	}
}