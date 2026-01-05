class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int stlen=students.length;
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<stlen;i++)
        {
            queue.add(students[i]);
            
        }
        for(int i=stlen-1;i>=0;i--)
        {
            stack.push(sandwiches[i]);
        }
        int count=0;
        while(!queue.isEmpty() && count<queue.size())
        {
            int front=queue.poll();
            if(front==stack.peek())
            {
                stack.pop();
                count=0;
            }
            else
            {
                queue.add(front);
                count++;
            }
        }
        return queue.size();
    }
}