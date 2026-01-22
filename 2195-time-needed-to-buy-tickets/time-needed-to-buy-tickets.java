class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            queue.add(i);
        }
        int count=0;
        while(!queue.isEmpty())
        {
            count++;
            int last=queue.poll();
            tickets[last]=tickets[last]-1;
            if(last==k && tickets[last]==0)
            {

                return count;
            }
            if(tickets[last]==0)
            {
                continue;
            }
            else
            {
                queue.add(last);
            }
        }
        return count;
    }
}