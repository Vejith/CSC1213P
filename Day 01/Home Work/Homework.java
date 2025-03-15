class Operators{
	public static void main(String[] args)
	{
		//Unary Operators
		int a=5;
		int b=-a;
		System.out.println("Unary Operator: "+b);
		
		//Logical Operators
		boolean x=true;
		boolean y=false;
		System.out.println("Logical 'AND' : "+(x&&y));
		System.out.println("Logical 'OR' : "+(x||y));
		System.out.println("Logical 'NOT' : "+(!y));
		
		//Relational Operators
		int m=10,v=20;
		System.out.println("Relational Greater than : "+(m>v));
		System.out.println("Relational Less than : "+(m<v));
		System.out.println("Relational Equals : "+(m==v));
		System.out.println("Relational Not Equals : "+(m!=v));
		
		//Assignment Operators
		int g=20;
		g+=3;
		System.out.println("Assignment Operator : "+g);
		
		//Terrory Operators
		int i=15,j=34;
		int MaxVal=(i>j)?i:j;
		System.out.println("Terrory Operator : "+MaxVal);
		
	}
}