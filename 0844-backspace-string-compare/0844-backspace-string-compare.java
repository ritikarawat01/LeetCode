class Solution {
    public boolean backspaceCompare(String s, String t) {
        String str1 = BuildString(s);
        String str2 = BuildString(t);
        return str1.equals(str2);
    }
    public String BuildString(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != '#'){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}