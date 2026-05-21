package number.com;

import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter nth position : ");
		int n = sc.nextInt();

		int count = 0;
		int num = 1;

		while (count < n) {

			num++;

			boolean flag = true;

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println(num);
				count++;
			}
		}

		System.out.println(n + "th prime number is : " + num);

		sc.close();
	}
}