import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // 1️⃣ Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // 2️⃣ Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3️⃣ Add current index
            dq.addLast(i);

            // 4️⃣ Store result
            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}
