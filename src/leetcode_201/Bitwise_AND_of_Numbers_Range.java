package leetcode_201;

/**
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 *
 * Example 1:
 *
 * Input: [5,7] 101 AND 110 AND 111 = 100
 * Output: 4
 * Example 2:
 *
 * Input: [0,1]
 * Output: 0
 */
public class Bitwise_AND_of_Numbers_Range {
    public static int rangeBitwiseAnd(int m, int n) {
        int res = 0;
        for(int i = 30; i >= 0; i--){
            int mask = 1 << i;
            if(mask > n) continue;
            if((mask & m) == (mask & n)) res|=mask & m;
            else break;
        }
        return res;
    }
    public static int rangeBitwiseAnd2(int m, int n){
        int offset = 0;
        while(m!= n){
            m = m>> 1;
            n = n >> 1;
            offset++;
        }
        return m << offset;
    }
    public static void main(String[] args){
//        int[] input = {5,7};
        System.out.println(rangeBitwiseAnd(5,7));
        System.out.println(rangeBitwiseAnd2(5,7));
    }

}
