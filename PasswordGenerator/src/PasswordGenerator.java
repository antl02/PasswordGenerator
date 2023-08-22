import java.util.Random;
/**
 * This class generates a password using StringBuilder, Random, and ASCII codes for reference.
 */
public class PasswordGenerator {
	
	private int length;  // length of resulting password
	private boolean hasNumbers;  // whether or not the password has numbers
	private boolean hasUpperCases;  // whether or not the password has upper-case characters
	private boolean hasSpecials;  // whether or not the password has special characters
	
	public PasswordGenerator(int length, boolean hasNumbers, boolean hasUpperCases, boolean hasSpecials) {
		this.length = length;
		this.hasNumbers = hasNumbers;
		this.hasUpperCases = hasUpperCases;
		this.hasSpecials = hasSpecials;
		
	}
	
	public String generatePassword()  // Returns a generated password
	{
		StringBuilder password = new StringBuilder();
		
		Random rng = new Random();
		
		for (int i = 0; i < length; i++) {
			switch (rng.nextInt(4))
			{
			case 0:  // numbers
				if (hasNumbers)
				{
					password.append(rng.nextInt(10));
					break;
				}
			case 1:
				if (hasUpperCases)  // upper-case chars
				{
					password.append((char) (rng.nextInt(26) + 65));  // upper-case chars are in the ASCII boundary 65-90 (inclusive)
					break;
				}
			case 2:
				if (hasSpecials)
				{
					password.append((char) (rng.nextInt(14) + 33));  // special chars are in the ASCII boundary 33-47 (inclusive)
					break;
				}
			default:  // lower-case chars
				password.append((char) (rng.nextInt(26) + 97));  // lower-case chars are in the ASCII boundary 97-122 (inclusive)
				break;
			}
		}
		
		return password.toString();
	}

}
