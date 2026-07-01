package array;

import java.util.Scanner;

public class CountPrime {

    public static int count(int n) {

        if (n <= 2)
            return 0;

        boolean[] prime = new boolean[n];

        // Step 1: Assume all numbers are prime
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        // Step 2: Mark multiples as non-prime
        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }

            }
        }

        // Step 3: Count primes
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(count(n));

        sc.close();
    }
}