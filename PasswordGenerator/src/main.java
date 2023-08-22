import java.util.Random;

public class main {

	public static void main(String[] args) {
		PasswordGenerator passgen = new PasswordGenerator(10, true, true, true);
		
		for (int i = 0; i < 5; i++)  // Prints 5 randomly generated passwords based on conditions provided to object.
		{
			System.out.println(passgen.generatePassword());
		}
		
	}

}
