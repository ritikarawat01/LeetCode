class Solution {
    public int[] singleNumber(int[] nums) {
       int xor = 0;
       for(int ele : nums)
       xor = xor ^ ele;
       //xor=6
       int mask = xor & (-xor);
       // 1 0 1 -> 2
       int a = 0;
       int b = 0;
       for( int ele : nums){
        if((ele & mask) != 0){
            a = a^ ele;
        }
        else{
            b = b ^ ele;
        }
       }
       return new int[]{a,b};
      
    }
}