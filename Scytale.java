/**
 * Husna Manalai
 * 4/24/2024
 */

//package encryption;

/**
 *  Implement the Scytale cipher encryption strategy.
 * 
 */
public class Scytale implements EncryptionStrategy {
	 /**
     * Encrypts the given text using the Scytale cipher algorithm.
     * 
     * @param text The text to be encrypted.
     * @param key The number of columns to use for encryption.
     * @return The encrypted text.
     */
	@Override
	public String encrypt (String text , int key) {
		//determine the number of rows needed
		int rowsNum = (int) Math.ceil((double) text.length()/key);
		
		StringBuilder result = new StringBuilder();			
		
		for(int col = 0; col < key; col++) {
			for (int row =0; row < rowsNum; row++) {
				// Calculate the index in the original text
				int index = row * key +col;
				if (index < text.length()) {
					result.append(text.charAt(index));
				}else {
				result.append(' ');
				}
			}
		}
		
		return result.toString().trim();
		
		
		
		
	}
	
	/**
     * Decrypts the given text using the Scytale cipher algorithm.
     * 
     * @param text The text to be decrypted.
     * @param key The numbr of columns to use for decryption.
     * @return The decrypted text.
     */
	@Override 
	public String decrypt(String text, int key) {
		int rowsNum = (int) Math.ceil((double) text.length() / key);
		char[] result = new char [text.length()];
		
		for(int col = 0; col < key; col++) {
			for(int row = 0; row < rowsNum; row++) {
				int index = row * key+col;
				if(index < text.length()) {
					// Place the character at the calculated position in the result array
					result[index] = text.charAt(col*rowsNum + row); 
				}
			}
		}
		
		return new String(result).trim();
		
		
	}
	
	
	
	
	
}