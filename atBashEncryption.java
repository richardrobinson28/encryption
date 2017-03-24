import java.util.Scanner;

public class atBashEncryption {
	private static Scanner	in	= new Scanner(System.in), input = new Scanner(System.in);
	private static String	encrypt, decrypt, output = "", alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 !\"£$%^&*()-=+,./\\",
	        atBash = "MNOPQRSTUVWXYZ67890ABCDEFG!\"£$HI12345JKLfghijklmno%^&*()-=+,./\\pq rstuvwxyzabcde";
	private static int		i, j, sCase, aLen, bashLen = atBash.length();

	public static void main(String args[]) {
		System.out.println("Do you want to: " + "\n1: encrypt" + "\n2: decrypt");
		sCase = in.nextInt();
		switchCase(sCase);
		in.close();
	}

	private static String switchCase(int a) {
		switch (a) {
			case 1:
				System.out.println("Please enter what you want to encrypt");
				encrypt = input.nextLine();
				aLen = encrypt.length();
				System.out.println(encrypt(encrypt, aLen));
				break;
			// return encrypt;
			case 2:
				System.out.println("Please enter what you want to decrypt");
				decrypt = input.nextLine();
				aLen = decrypt.length();
				System.out.println(decrypt(decrypt, aLen));
				break;
			// return decrypt;
			default:
				System.out.println("Please choose either encrypt or decrypt");
				break;
		}
		input.close();
		return "";
	}

	private static String encrypt(String a, int b) {
		for (i = 0; i < b; i++) {
			for (j = 0; j < bashLen; j++) {
				if (a.charAt(i) == alphabet.charAt(j)) {
					output += atBash.charAt(j);
				}
			}
		}

		return output;
	}

	private static String decrypt(String a, int b) {
		for (i = 0; i < b; i++) {
			for (j = 0; j < bashLen; j++) {
				if (a.charAt(i) == atBash.charAt(j)) {
					output += alphabet.charAt(j);
				}
			}
		}
		return output;
	}
}
