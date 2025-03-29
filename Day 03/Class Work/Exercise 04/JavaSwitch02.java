import java.util.Scanner;
class JavaSwitch02{
	public static void main (String [] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char letter = ob.next().charAt(0);
		
		/*switch (letter)
		{
			case 'A':
			case 'a':System.out.println(letter+" is one of the vowel");
			break;
			
			case 'E':
			case 'e':System.out.println(letter+" is one of the vowel");
			break;
			
			case 'I':
			case 'i':System.out.println(letter+" is one of the vowel");
			break;
			
			case 'O':
			case 'o':System.out.println(letter+" is one of the vowel");
			break;
			
			case 'U':
			case 'u':System.out.println(letter+" is one of the vowel");
			break;
			
			default:System.out.println(letter+" is not a vowel");
		}*/
			
			switch (letter)
			{
				case 'a': case 'e': case 'i': case 'o': case 'u':
				case 'A': case 'E': case 'I': case 'O': case 'U':
				System.out.println(letter+" is one of the vowel");
				break;
				
				default:System.out.println(letter+" is not a vowel");
			}
	}
}