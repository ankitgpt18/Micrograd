package com.lab4;

//a) It must have atleast one lower case character and one digit.
//b) It must not have any Upper case characters and any special
//characters
//c) length should be b/w 5-12.
//d) It should not have any same immediate patterns like
//abcanan1 : not acceptable coz of an an pattern
//abc11se: not acceptable, coz of pattern 11
//123sd123 : acceptable, as not immediate pattern
//adfasdsdf : not acceptable, as no digits
//Aasdfasd12: not acceptable, as have uppercase character

//doubt
public class PasswordChecker {

	public static boolean isValidPassword(String password) {
		if (password.length() < 5 || password.length() > 12) {
			return false;
		}

		boolean hasLowerCase = false;
		boolean hasDigit = false;

		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isLowerCase(c)) {
				hasLowerCase = true;
			} else if (Character.isDigit(c)) {
				hasDigit = true;
			} else if (Character.isUpperCase(c) || !Character.isLetterOrDigit(c)) {
				return false; // Contains uppercase or special character
			}
		}

		if (!hasLowerCase || !hasDigit) {
			return false;
		}

		for (int i = 0; i < password.length() - 1; i++) {
			String sub = password.substring(i, i + 2);
			if (password.indexOf(sub, i + 2) != -1) {
				return false; // Immediate repeating pattern found
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String[] testPasswords = { "vishvendra", "asdfghjkl", "123sd123", "asdf1234", "Aasdfasd12" };

		for (String password : testPasswords) {
			System.out.println("Password: " + password + " is " + (isValidPassword(password) ? "valid" : "invalid"));
		}
	}
}
