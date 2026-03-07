class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++)
        {
            q.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--)
        {
            stack.push(sandwiches[i]);
        }
        int count=0;
        while(!q.isEmpty() && count<q.size())
        {
            if(q.peek()==stack.peek())
            {
                
                q.poll();
                stack.pop();
                count=0;
            }
            else
            {
                q.add(q.poll());
                count++;
            }
        }
        return q.size();
    }
}