public class Solution {
    public int trailingZeroes(int n){
        int factorial = Factorial(n);
        int lastNo = 0, count = 0;

        if(factorial == 0){
            return 0;
        }else {
            while (lastNo == 0) {
                lastNo = factorial % 10;
                factorial = factorial / 10;
                if (lastNo == 0) {
                    count++;
                }
            }
        }
        return count;
    }


    public int Factorial(int n) {
        if(n - 1 != 1){
            n = n * Factorial(n - 1);
        }return n;
    }
}
