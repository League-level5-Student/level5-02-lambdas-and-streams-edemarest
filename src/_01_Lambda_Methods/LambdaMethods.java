package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		printCustomMessage((s)->{
			String bs = "";
			for(int i = s.length()-1; i >= 0; i--) {
				bs+=s.charAt(i);
			}
			System.out.println(bs);
		}, "repeat");
		
		printCustomMessage((s)->{
			String bs = "";
			for(int i = 0; i < s.length(); i++) {
				if(i%2 == 0) {
					bs+=Character.toString(s.charAt(i)).toUpperCase();
				}
				else {
				bs+=Character.toString(s.charAt(i)).toLowerCase();
				}
			}
			System.out.println(bs);
		}, "repeat");
		
		printCustomMessage((s)->{
			String bs = "";
			for(int i = 0; i < s.length(); i++) {
				bs+=s.charAt(i)+".";
			}
			System.out.println(bs);
		}, "repeat");
		printCustomMessage((s)->{
			String bs = "";
			for(int i = 0; i < s.length(); i++) {
				if(!(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')) {
					bs += s.charAt(i);	
				}
			}
			System.out.println(bs);
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
