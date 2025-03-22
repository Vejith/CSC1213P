public class Typecasting02{
public static void main(String[] args){
	
	int num=5004;
	double doublenum = (double) num;
	System.out.println("The value of "+num+" after converting to the double is "+doublenum);
	
	int convertedInt=(int) doublenum;
	System.out.println("The value of "+doublenum+" after converting to the int again is "+convertedInt);
}
}