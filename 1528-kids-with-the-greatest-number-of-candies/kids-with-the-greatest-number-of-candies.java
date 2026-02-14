class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<candies[i])
            {
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(max<=candies[i]+extraCandies)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}