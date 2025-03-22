class Details{
	public static void main (String args [])
	{
		String Name,Address,DOB,Sex;
		int Age;
		Name=args[0];
		Address=args[1];
		DOB=args[2];
		Sex=args[3];
		Age=Integer.parseInt(args[4]);
		
		System.out.println("Name : "+Name+"\n"+"Address : "+Address+"\n"+"Date of birth : "+DOB+"\n"+"Sex : "+Sex+"\n"+"Age : "+Age);
		
		int a=10;
		int b=a+Age;
		System.out.println("B is : "+b);
		
		/*System.out.println("Name : "+args[0]+"\n"+"Address : "+args[1]+"\n"+"Date of birth : "+args[2]+"\n"+"Sex : "+args[3]+"\n"+"Age : "+args[4]);*/
	}
}