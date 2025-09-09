package part3;

public class PasswordGen {
	public static String genUsername(String email) {
		String username = email.substring(0, email.indexOf("@"));
		return username;
	}
	public static String genPassword() {
		String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
		String password = "";
		for(int i = 0; i < 10; i++) {
			password += charset.charAt((int)(Math.random() * charset.length()));
		}
		return password;
	}
}
