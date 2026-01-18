import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);          // 1️⃣ Sort the deck
        Deque<Integer> dq = new LinkedList<>();

        // 2️⃣ Process from largest to smallest
        for (int i = deck.length - 1; i >= 0; i--) {

            // Move last to front (reverse of step 2)
            if (!dq.isEmpty()) {
                dq.addFirst(dq.removeLast());
            }

            // Put current card on top
            dq.addFirst(deck[i]);
        }

        // 3️⃣ Convert deque to array
        int[] res = new int[deck.length];
        int idx = 0;
        for (int card : dq) {
            res[idx++] = card;
        }

        return res;
    }
}
