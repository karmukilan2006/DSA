class Solution {
    public int trap(int[] height) {

        Stack<Integer> stack = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {

            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {

                int mid = stack.pop();

                if (stack.isEmpty()) 
                {
                    break;
                }

                int left = stack.peek();

                int width = i - left - 1;
                int boundedHeight = Math.min(height[left], height[i]) - height[mid];

                water += width * boundedHeight;
            }

            stack.push(i);
        }

        return water;
    }
}

