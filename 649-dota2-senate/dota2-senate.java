import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {

        int n = senate.length();

        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        // Store indices
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.add(i);
            } else {
                dQueue.add(i);
            }
        }

        // Process queues
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {

            int r = rQueue.poll();
            int d = dQueue.poll();

            if (r < d) {
                // R bans D
                rQueue.add(r + n);
            } else {
                // D bans R
                dQueue.add(d + n);
            }
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
