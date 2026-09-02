import java.util.Arrays;

class Solution {
    int[] dp;

    int solve(int ind, int[] nums) {
        if (ind >= nums.length) return 0;
        if (dp[ind] != -1) return dp[ind];

        int notPick = solve(ind + 1, nums);
        int pick = nums[ind] + solve(ind + 2, nums);

        return dp[ind] = Math.max(pick, notPick);
    }

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(0, nums);
    }
}
