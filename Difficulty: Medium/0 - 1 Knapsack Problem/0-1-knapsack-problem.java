class Solution {
    int ways(int w, int val[], int wt[], int idx, int[][] mem) {
        if(w == 0 || idx < 0)return 0;
        if(mem[w][idx] != 0)return mem[w][idx];
        int notTake = ways(w,val,wt,idx-1,mem);
        if(w-wt[idx] < 0)return notTake;
        int take = ways(w-wt[idx],val,wt,idx-1,mem)+val[idx];
        
        return mem[w][idx] = Math.max(notTake,take);
        
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] mem = new int[W+1][val.length];
       return ways(W, val, wt,val.length-1, mem);
    }
}
