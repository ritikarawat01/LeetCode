class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] prev = new int[n];
        int[] next  = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0 ; i<n ; i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                prev[i] = -1;
            }else
            {
                prev[i] = stack.peek();
            }
            stack.push(i);
        }
        
        stack.clear();

        for(int i=n-1 ; i>=0 ; i--)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                next[i] = n;
            }else
            {
                next[i] = stack.peek();
            }
            stack.push(i);
        }

        int max = heights[0];

        for(int i=0 ; i<n ; i++)
        {
            int x = next[i] - prev[i] - 1;
            max = Math.max(max, x*heights[i]);
        }

        return max;

    }
}