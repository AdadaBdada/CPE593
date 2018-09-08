import java.util.Arrays;

public class Prime {//psvm
    public static void main(String[] args) {
        // sout
        //System.out.println(Prime.isPrime(9));
        //System.out.println(Prime.eratosthenes(10));
        System.out.println(Prime.betterEratosthenes(10));

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean[] eratosthenes(int n) {

        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        for (int i = 2; i < n; i++)
            if (primes[i])
                for (int j = 2 * i; j < n; j += i) // 所有i的倍数都设为0
                    primes[j] = false;
        for (int i = 0; i < primes.length; i++) { //fori
            System.out.println(primes[i]);
        }
        return primes;
    }

    public static boolean[] betterEratosthenes(int n) {

        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);

        for (int i = 4; i < n; i += 2) {
            primes[i] = false;
        }
        for (int i = 3; i < n; i++)
            if (primes[i])
                for (int j = i * i; j < n; j += 2*i)
                        primes[j] = false;
        for (int i = 0; i < n; i++) {
            System.out.println(primes[i]);
        }
        return primes;
     }
}
