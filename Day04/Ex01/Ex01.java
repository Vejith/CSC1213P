import java.util.Scanner;
public class Ex01{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find the summation : ");
		int n=s.nextInt();
		int i=1,sum=0;
		while(i<=n){
			sum+=i;
			i++;
		}
		System.out.println("Summation of numbers from 0 to "+n+" : "+sum);
	}
}