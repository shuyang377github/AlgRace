package leetcode_371;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example 1:
 *
 * Input: a = 1, b = 2      1 01 | 1 10 = 1 11
 * Output: 3
 * Example 2:
 *
 * Input: a = -2, b = 3      0 10 | 1 11 =  1 11
 * Output: 1
 */
public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        //binary add == every digit ^
        //进位 & << 1
        while(b!= 0){
            int temp = a ^ b;
            b = (a&b) << 1; //进位
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(getSum(1,2));
        System.out.println(getSum(-2,3));
    }
}
