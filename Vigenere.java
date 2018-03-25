import java.util.Scanner;

public class Vigenere {

	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter your plaintext: ");
		String plaintext = input.nextLine();
		System.out.print("Enter the key word: ");
		String key=input.nextLine();
		System.out.print("Before Decryption: "+plaintext+"\nAfter Decryption: "+encrypt(plaintext,key));
	}
	
	public static String encrypt(String plaintext, String key) {
		plaintext.toUpperCase();
		key.toUpperCase();
		char[] plainArr = plaintext.toCharArray();
		char[] keyArr = key.toCharArray();
		char[] encryptArr=plaintext.toCharArray();
		if (plainArr.length != keyArr.length) {
			System.out.print("Error:  Key is not the same length as plaintext.");
		} else {
			for (int i=0; i<plainArr.length; i++) {				
				if (plainArr[i]+keyArr[i] >'Z') {
					encryptArr[i]=(char) (plainArr[i]+keyArr[i] +'Z'-'A'+1);
				} else {
				encryptArr[i]= (char) (plainArr[i]+keyArr[i]);
				}
			}
		} 
		return new String(encryptArr);	
	}
}
