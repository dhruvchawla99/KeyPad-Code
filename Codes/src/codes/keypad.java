package codes;
import java.util.Scanner;


public class keypad {

	public static String[] keypadCombinations( int input) {
		if(input == 0) {
			String[] output = new String[1];
			output[0]="";
			return output ;
		}
		String[] smallOutput = keypadCombinations(input/10);
		int lastDigit = input%10;
		String lastDigitOptions = getOptions (lastDigit);
		String[] ouput = new String[smallOutput.length * lastDigitOptions.length()];
		int k = 0;
		for ( int i = 0 ; i < smallOutput.length ; i++) {
			for (int j = 0 ; j < lastDigitOptions.length() ; j++) {
				ouput[k] = smallOutput[i] + lastDigitOptions.charAt(j);
				k++;
				
						
			}
		}
		return ouput ;
	}
	
	public static String getOptions(int digit ) {
		 
		 if(digit==2) {
			 return "abc";
		 }
		 if (digit ==3) {
			 return "def";
			 
		 }
		 return "" ;
		
	}

	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int input = s.nextInt();
		
		String [] output = keypadCombinations(input);
		for (String outputString : output) {
			System.out.println(outputString);
		}
		
		
	}

}
