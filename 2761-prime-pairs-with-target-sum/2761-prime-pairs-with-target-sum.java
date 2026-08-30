
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                ans.add(Arrays.asList(i, n - i));
            }
        }

        return ans;
    }
}