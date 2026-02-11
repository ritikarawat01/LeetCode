class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> used = new HashSet<>();
        helper(arr, 0, result);
        return result;
    }

    static void swap(int[] arr, int f, int s)
    {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
        return;
    }

    static void helper(int[] arr, int start, List<List<Integer>> result)
    {
        if(start == arr.length)
        {
            List<Integer> perm = new ArrayList<>();
            for(int num : arr)
            {
                perm.add(num);
            }
            result.add(perm);
            return;
        }

        HashSet<Integer> used = new HashSet<>();

        for(int i=start; i<arr.length ; i++)
        {
            if(used.contains(arr[i])) continue;
            used.add(arr[i]);

            swap(arr, start, i);
            helper(arr, start+1, result);
            swap(arr, start, i);
        }
    }
}