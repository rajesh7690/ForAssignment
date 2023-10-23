import java.util.Scanner;

public class CheckPangram {
	public static boolean check(String str) {
		boolean[] mark = new boolean[26];

		int pos = 0;

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				pos = str.charAt(i) - 'A';
			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				pos = str.charAt(i) - 'a';
			else
				continue;
			mark[pos] = true;
		}

		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return (false);

		return (true);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (check(str) == true)
			System.out.println("pangram");
		else
			System.out.println("not a pangram");
	}
}
