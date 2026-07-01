class Solution {
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] mem = new int[W+1][val.length+1];
        
        for(int i = 1;i<=W;i++){
            for(int j = 1; j<=val.length;j++){
                if(i-wt[j-1] >= 0){
                    mem[i][j] = Math.max(mem[i][j-1],mem[i-wt[j-1]][j-1]+val[j-1]);
                }
                else{
                    mem[i][j] = mem[i][j-1];
                }
            }
        }
        return mem[W][val.length];
    }
}
