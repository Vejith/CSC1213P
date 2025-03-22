import java.util.Scanner;
class UserInput{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Your Firstname: ");
		fname = sc.nextLine();
		
		System.out.print("Enter Your Lastname: ");
		String lname = sc.next();
		
		System.out.print("Enter Your Age: ");
		int Age = sc.nextInt();
		
		System.out.print("Enter your Registration Number: ");
		String Reg = sc.next();
		
		System.out.print("Sex (M/F): ");
		char Sex = sc.next().charAt(0);
		
		System.out.print("Enter Your Mobile Number: ");
		long mob = sc.nextLong();
		
		System.out.print("Enter Your GPA: ");
		double gpa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Fullname: "+fname+" "+lname+"\n"+"Age is: "+Age+"\n"+"Reg Number: "+Reg+"\n"+"Sex: "+Sex+
		"\n"+"Mobile Number: "+"\n"+mob+"\n"+"GPA is: "+gpa);
		
	}
}