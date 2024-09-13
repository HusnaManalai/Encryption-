/**
 * Husna Manalai
 * 4/24/2024
 */

//package encryption;

/**
 *  Implement the Caesar cipher encryption strategy
 *  
 */
public class Caesar implements EncryptionStrategy {
	/**
     * Encrypts the given text using the Caesar cipher algorithm.
     * 
     * @param text the text to be encrypted.
     * @param key The number of positions to shift each character
     * @return The encrypted text
     */
	@Override
    public String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c >= 32 && c <= 126) {
            	// Shift the character by the key within the printable range and wrap around if necessary
                encryptedText.append((char)((c + key - 32) % 95 + 32));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
	
	 /**
     * Decrypts the given text using the Caesar cipher algorithm.
     * 
     * @param text The text to be decrypted.
     * @param key The number of positions to shift each character back.
     * @return The decrypted text.
     */
    @Override
    public String decrypt(String text, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
        	// Check if the character is within the ASCII range
            if (c >= 32 && c <= 126) {
                decryptedText.append((char)((c - key - 32 + 95) % 95 + 32));
            } else {
                decryptedText.append(c);
            }
        }
        return decryptedText.toString();
    }
}
