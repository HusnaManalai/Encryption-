/**
 * Husna Manalai
 * 4/24/2024
 */

//package encryption;
/**
 *  Implement the Copy encryption strategy
 *  -Copies the text only
 */
public class Copy implements EncryptionStrategy {
  @Override
  public String encrypt(String text, int key) {
	  return text;
  }
  
  
  @Override
  public String decrypt(String text, int key) {
	  return text;
  }
  
}
