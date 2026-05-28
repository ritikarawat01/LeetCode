class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            nums[right] = nums[right] * nums[right];
            left++;
        }
        Arrays.sort(nums);
        return nums;
    }
}