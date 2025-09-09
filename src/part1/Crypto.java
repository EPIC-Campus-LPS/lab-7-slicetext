package part1;

public class Crypto {
	public static String encrypt(String message, int shift) {
		char[] chars = message.toCharArray();
		String result = "";
		for(char c : chars) {
			if(!".,?! ".contains(c + "")) {
				if(isUpper(c)) {
					result += shift(c, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", shift);
				} else {
					result += shift(c, "abcdefghijklmnopqrstuvwxyz", shift);
				}
			} else {
				result += c;
			}
		}
		return result.toString();
	}
	public static String decrypt(String message, int shift) {
		return encrypt(message, 26-shift);
	}
	static char shift(char c, String char_set, int shift) {
		int index = char_set.indexOf(c);
		index += shift;
		if(index >= char_set.length()) {
			index -= char_set.length();
		}
		return char_set.charAt(index);
	}
	static boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}
}
