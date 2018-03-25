import java.util.ArrayList;

public class RowTranspositionCipher {
	
public static void main (String args[]) {
		cipher("attackpostponeduntiltwoamxyz", "4,3,1,2,5,6,7");	
}
	public static void cipher(String plaintext, String key) {
		
		char[] plainArr = plaintext.toCharArray();
		char[] keyArr = key.toCharArray(); //[4,5,6,1,7,2,3]
		ArrayList ciphertext = new ArrayList();
		String order = "1,2,3,4,5,6,7";
		char[] keyOrd = order.toCharArray();
		
		for (int i = 0; i< 7; i++) { //for each number in key organized
			for (int j=0; j<7; j++) {  //checks order for them, the real key
				if (keyOrd[i] == keyArr[j]) {
					for (int k=0; k<plaintext.length(); k++) {  //checks letters of plaintext
						if (k % 7==j) {
							ciphertext.add(plainArr[k]);
						}
					}
				}
			}
		} System.out.print(plaintext+"becomes "+ ciphertext.toString()+" after encryption");
	}
	
}
