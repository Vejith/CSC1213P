import java.util.Scanner;
class Ex04{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		int arr [] = new int [5];
		
		for (int i=0; i<5; i++)
		{
			System.out.print("Enter a number: ");
			arr[i] = ob.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for (int i=1; i<5; i++)
		{
			if (arr[i] > max)
			{
				max=arr[i];
			}
			if (arr[i] < min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("The largest number is: "+max);
		System.out.println("The lowest number is: "+min);
	}
}