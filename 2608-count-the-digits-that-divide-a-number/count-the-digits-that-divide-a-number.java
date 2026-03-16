class Solution {
    public int countDigits(int num) {
        int n=num;
        List<Integer> list=new ArrayList<>();
        while(n>0)
        {
            list.add(n%10);
            n=n/10;
        }
        int count=0;
        for(int i=0;i<list.size();i++)
        {
            if(num%list.get(i)==0)
            {
                count++;
            }
        }
        return count;

    }
}