class Solution {
    int countStrings(int n) {
        // code here
        if(n == 1)return 2;
        if(n== 2 )return 3;
        int ptr1 = 2;
        int ptr2 = 3;
        int ptr3 = 0;
        for(int i = 3 ; i <= n ; i++ ){
            ptr3 =  ptr2;
            ptr2 = ptr1 + ptr2;
            ptr1 = ptr3;
        }
        return ptr2;
    }
}