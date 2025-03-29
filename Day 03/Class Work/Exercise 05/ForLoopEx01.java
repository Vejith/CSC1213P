import java.util.Scanner;
class ForLoopEx01{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = ob.nextInt();
		
		for (int i=1; i<=num; i++)
		{
			System.out.print(i+"\t");
		}
	}
}