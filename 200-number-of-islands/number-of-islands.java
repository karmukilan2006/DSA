class Solution {

    public void solve(char[][] grid,int i,int j,int R,int C)
    {
        if(i>=0 && i<R && j>=0 && j<C)
        {
            if(grid[i][j]!='1')
            {
                return;
            }
            grid[i][j]='2';
            solve(grid,i+1,j,R,C);
            solve(grid,i-1,j,R,C);
            solve(grid,i,j+1,R,C);
            solve(grid,i,j-1,R,C);
        }
    }
    public int numIslands(char[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int island=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(grid[i][j]=='1')
                {
                    island++;
                    solve(grid,i,j,R,C);
                }
            }
        }
        return island;
    }
    
}