class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int n = nums.size();
        int maxx = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > maxx) {
                maxx = nums[i];
            }
        }

        vector<int> feq(maxx + 1, 0);
        for (int i = 0; i < n; i++) {
            feq[nums[i]]++;
        }

        for (int i = 0; i <= maxx; i++) {
            if (feq[i] > 1) {
                return i;
            }
        }

        return -1; 
    }
};
