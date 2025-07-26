class Solution {
    public static void makeZero(int i,int j,int r,int c,char grid[][]){
        if(i<0||j<0||i>=r||j>=c||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        makeZero(i+1,j,r,c,grid);
        makeZero(i-1,j,r,c,grid);
        makeZero(i,j+1,r,c,grid);
        makeZero(i,j-1,r,c,grid);

    }
    public int numIslands(char[][] grid) {
        int island=0; 
        int r=grid.length;
        int c=grid[0].length;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    island+=1;
                    makeZero(i,j,r,c,grid);
                }
            }
        }
        return island;
    }
}