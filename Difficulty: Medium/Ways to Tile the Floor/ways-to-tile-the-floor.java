class Solution {
    int ways(int n, int m, int[] mem){
        if(n==0)return 1;
        if(mem[n-1] != 0)return mem[n-1];
        int vertical = ways(n-1,m, mem);
        if(n-m < 0)return vertical;
        int horizontal = ways(n-m,m, mem);
        return mem[n-1] = (vertical + horizontal) % 1000000007;
    }
    public int countWays(int n, int m) {
        // code here
        int[] mem = new int[n];
       return ways(n,m, mem) % 1000000007;
    }
}