class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        boolean[] used=new boolean[n];
        solve(nums,used,res,new ArrayList<>());
        List<List<Integer>> unique = new ArrayList<>();

        for (int i = 0; i < res.size(); i++) {
            if (!unique.contains(res.get(i))) {
                unique.add(res.get(i));
            }
        }

        return unique; 
        
    }
    public void solve(int[] nums,boolean[] used,List<List<Integer>> res,List<Integer> list)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
            {
                continue;
            }
            used[i]=true;
            list.add(nums[i]);
            solve(nums,used,res,list);
            list.remove(list.size()-1);
            used[i]=false;
        }
    }
}