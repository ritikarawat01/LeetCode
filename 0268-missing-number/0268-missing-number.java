class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            sum ^= nums[i];
        }
        int sum1 = 0;
        for(int i = 0;i<=n ; i++){
            sum1 ^= i;
        }return (sum1 ^ sum);
        
    }
}