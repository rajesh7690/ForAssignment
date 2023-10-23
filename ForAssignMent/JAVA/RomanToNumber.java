import java.util.Scanner;

public class RomanToNumber {
	public static int roman(char ch) {
		if (ch == 'I')
			return 1;
		if (ch == 'V')
			return 5;
		if (ch == 'X')
			return 10;
		if (ch == 'L')
			return 50;
		if (ch == 'C')
			return 100;
		if (ch == 'D')
			return 500;
		if (ch == 'M')
			return 1000;
		return -1;
	}

	public static int  convert(String s) {
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			int str1 = roman(s.charAt(i));
			if (i + 1 < s.length()) {
				int str2 = roman(s.charAt(i + 1));
				if (str1 >= str2) {
					total = total + str1;
				} 
				else {
					total = total - str1;
				}
			} 
			else {
				total = total + str1;
			}
		}
		return total;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String rom = sc.next();
		System.out.println( convert(rom));
		sc.close();
	}
}