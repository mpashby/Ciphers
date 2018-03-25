import java.util.*;
public class Monoalphabetic {

	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter your plaintext: ");
		String plaintext = input.nextLine();
		System.out.print("Enter the key (ciphertext alphabet): ");
		String key=input.nextLine();
		System.out.print("Plaintext before decryption: "+plaintext+"\nCiphertext was: "+key+"\nAfter decryption: "+mono(plaintext, key));
	}
	
	public static String mono(String plaintext, String key) {
		key.toUpperCase();
		char[] plainArr=plaintext.toCharArray();
		char[] keyArr=key.toCharArray();		
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] alphaArr=alpha.toCharArray();
		for (int i=0; i<plainArr.length; i++) {  //for each letter in the plaintext
			char pletter = plainArr[i];
			for (int j=0; j<alphaArr.length; j++) { //for each letter in alphabet
				if (pletter==alphaArr[j]) {
					plainArr[i]=keyArr[j];
				} break;
			}
		} 
		
		return new String(plainArr);
	}
}
