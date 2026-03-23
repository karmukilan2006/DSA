class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] vis=new boolean[n];
        dfs(0,vis,rooms);
        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                return false;
            }
        }
        return true;

    }
    public void dfs(int roomno,boolean[] vis,List<List<Integer>> rooms)
    {
        if(vis[roomno])
        {
            return;
        }
        vis[roomno]=true;
        for(int key : rooms.get(roomno))
        {
            dfs(key,vis,rooms);
        }
    }
}