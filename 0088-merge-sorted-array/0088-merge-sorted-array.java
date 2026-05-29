class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // toh bhai yeh last ele se trverese krne k liye hai
        int j = n - 1; // same yeh bhi
        int k = m + n -1; // yeh toh bhai nums1 ka ele traverse krne k liye
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}