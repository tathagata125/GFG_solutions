class Solution {
    int ways(int n, int[] mem){
        if(n == 0)return 1;
        if(mem[n-1] != 0)return mem[n-1];
        int vertical = ways(n-1, mem);
        if(n-2 < 0)return vertical;
        int horizontal = ways(n-2,mem);
        return mem[n-1] = vertical+horizontal;
    }
    public int numberOfWays(int n) {
        // code here
        int[] mem = new int[n];
        return ways(n, mem);
    }
};