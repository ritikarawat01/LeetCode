class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); //Ek list ke andar multiple integer lists
        List<Integer> temp = new ArrayList<>();//Ek list jisme integers store honge
        solve(0, nums, temp, ans);
        return ans;
    }
    public void solve(int id, int[] nums, List<Integer> temp, List<List<Integer>> ans){
        //here we are storing the current subset
        ans.add(new ArrayList<>(temp));
        //trying all possible choices
        for(int i = id ; i < nums.length; i++){
            //including the current ele
            temp.add(nums[i]);
            solve(i+1, nums, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}