class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) sum = sum + arr[i];
        int maxi = sum;
        for(int i = k; i < arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            maxi = Math.max(maxi, sum);
        }
        return (double)maxi/k;
    }
}