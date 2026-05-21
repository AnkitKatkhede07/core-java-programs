package basic.com.program;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 0;
		for (int i = 1; i <= 10; i++) {
			t = n * i;
			System.out.println(t);
		}
		sc.close();
	}

}
