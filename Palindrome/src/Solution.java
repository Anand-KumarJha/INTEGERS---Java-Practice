class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum = 0,lastOne;

        if((x % 10 == 0 && x != 0) || x < 0){
            return false;
        }
        while(reversedNum < x){
            lastOne = x %  10;
            reversedNum = reversedNum * 10 + lastOne;
            x = x/10;
        }
        return x == reversedNum/10 || x == reversedNum;
    }
}