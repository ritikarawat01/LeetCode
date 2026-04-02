class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            int b = nums[i];
            a = a ^ b;

        }
        return a;
    }
}