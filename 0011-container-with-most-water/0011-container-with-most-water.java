class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxi = 0;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int water = h * width;
            maxi = Math.max(maxi, water);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxi;
    }
}