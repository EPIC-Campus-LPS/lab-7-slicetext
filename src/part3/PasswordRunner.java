package part3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PasswordRunner {
	public static void main(String[] args) throws IOException {
		File f = new File("emails.txt");
		Scanner scanner = new Scanner(f);
		while(scanner.hasNextLine()) {
			String next = scanner.nextLine();
			System.out.println(PasswordGen.genUsername(next) + ", " + PasswordGen.genPassword());
		}
		scanner.close();
	}

}
