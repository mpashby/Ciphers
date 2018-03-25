
import java.util.*;

public class Caesar {

	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);	
	System.out.print("Enter your plaintext: ");
	String plaintext = input.nextLine();
	System.out.print("Enter the key (number of rotations): ");
	int key=input.nextInt();
	System.out.print("Before Decryption: "+plaintext+"\nAfter D ecryption: "+caesar(plaintext,key));
	} 
	
	public static String caesar(String plaintext, int key) {
		char[] charArr=plaintext.toCharArray();
		for (int i =0; i< charArr.length; i++) {
			char letter = charArr[i];
			if (letter>='a'&& letter<='z') {  //lowercase
				letter = (char) (letter-key);
				if (letter>'z') {  //if goes over
					letter = (char)(letter + 'z'-'a'+1);
				} 
			} else if (letter >='A'&& letter<='Z') {  //uppercase
				letter = (char) (letter-key);
				if (letter>'Z') {
					letter = (char)(letter+'Z'-'A'+1);
				}
			}
			charArr[i]=letter;
		}
		return new String(charArr);		
	}
}
