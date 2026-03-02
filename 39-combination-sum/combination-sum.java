class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        solve(0,target,candidates,new ArrayList<>(),res);
        return res;
    }
    public void solve(int index,int target,int[] candidates,List<Integer> list, List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            list.add(candidates[i]);
            solve(i,target-candidates[i],candidates,list,res);
            list.remove(list.size() - 1);

        }
    }
}