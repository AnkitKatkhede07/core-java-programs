package number.com;

import java.util.Scanner;

public class CompositeNumber {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a Number : ");
        int n = sc.nextInt();;
        int count = 0;

        for(int i = 1; i <= n; i++) {

            if(n % i == 0) {
                count++;
            }
        }

        if(count > 2) {
            System.out.println("Number is Composite");
        }
        else {
            System.out.println("Number is not Composite");
        }
        sc.close();
    }
}
/*
 * 
 * Composite Number Theory
 * 
 * 
 * A composite number is a number that has more than two factors.
 * 
 * It means:
 * 
 * A composite number is divisible by: 1 itself and at least one more number.
 * Examples of Composite Numbers 4 → Factors: 1, 2, 4 6 → Factors: 1, 2, 3, 6 8
 * → Factors: 1, 2, 4, 8 10 → Factors: 1, 2, 5, 10
 * 
 * These numbers have more than 2 factors, so they are composite numbers.
 *
 */