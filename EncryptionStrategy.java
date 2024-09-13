/**
 * Husna Manalai 
 * 4/24/2024
 */
//package encryption;

/**
 * the encryption strategy interface
 */
public interface EncryptionStrategy {
	
    String encrypt(String text, int key);
    String decrypt(String text, int key);
}

