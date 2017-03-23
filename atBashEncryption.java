import java.util.Scanner;

public class atBashEncryption {
	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Do you want to: " + "\nencrypt" + "\ndecrypt");
		switchCase(input.nextLine());
	}

	public static String switchCase(String a) {
		String encrypt, decrypt;

		switch (a) {
			case "encrypt":
				System.out.println("Please enter what you want to encrypt");
				encrypt = encrypt(input.nextLine());
				System.out.println(encrypt);
				return encrypt;
			case "decrypt":
				System.out.println("Please enter what you want to decrypt");
				decrypt = decrypt(input.nextLine());
				System.out.println(decrypt);
				return decrypt;
			default:
				System.out.println("Please choose either encrypt or decrypt");
				break;
		}
		input.close();

		return "";
	}

	public static String encrypt(String a) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !\"£$%^&*()-=+,./\\",
		        atBash = "MNOPQRSTUVWXYZABCDEFG!\"£$HIJKLfghijklmno%^&*()-=+,./\\pq rstuvwxyzabcde", output = "";
		int i, j, aLen = a.length(), bashLen = atBash.length();

		for (i = 0; i < aLen; i++) {
			for (j = 0; j < bashLen; j++) {
				if (a.charAt(i) == alphabet.charAt(j)) {
					output += atBash.charAt(j);
				}
			}
		}

		return output;
	}

	public static String decrypt(String a) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !\"£$%^&*()-=+,./\\",
		        atBash = "MNOPQRSTUVWXYZABCDEFG!\"£$HIJKLfghijklmno%^&*()-=+,./\\pq rstuvwxyzabcde", output = "";
		int i, j, aLen = a.length(), bashLen = atBash.length();

		for (i = 0; i < aLen; i++) {
			for (j = 0; j < bashLen; j++) {
				if (a.charAt(i) == atBash.charAt(j)) {
					output += alphabet.charAt(j);
				}
			}
		}
		return output;
	}
}