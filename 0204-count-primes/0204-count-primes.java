class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        // Only track odd numbers, halve memory usage
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        // Handle 2 separately
        int count = 1;

    
        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

    
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
