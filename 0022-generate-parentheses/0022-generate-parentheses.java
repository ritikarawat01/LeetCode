class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        back(li, "", 0, 0, n);
        return li;

    }
    void back(List<String> li, String curr, int open, int close, int n){
        if(curr.length() == 2*n){      //agr saare brackets present hai already toh 
            li.add(curr);
            return;
        }
        //agr '( ' yeh add krna hai toh
        if(open < n){
            back(li, curr + "(", open + 1, close, n);
        }
        //agr ")" yeh add krna hai toh
        if(close < open){
            back(li, curr + ")", open, close+1, n);
        }
    }
}