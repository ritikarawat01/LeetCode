class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // 1. Expand
            sum += nums[right];

            // 2. Shrink while condition is satisfied
            while (sum >= target) {

                // 3. Update answer
                minLen = Math.min(minLen, right - left + 1);

                // 4. Remove left element
                sum -= nums[left];

                // 5. Move left
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    
}