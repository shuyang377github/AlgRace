package leetcode_318;

/**
 * Given a string array words
 * find the maximum value of length(word[i]) * length(word[j])
 * where the two words do not share common letters.
 * You may assume that each word will contain only lower case letters.
 * If no such two words exist, return 0.
 *
 * Example 1:
 * Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
 * Output: 16
 * Explanation: The two words can be "abcw", "xtfn".
 *
 * Example 2:
 * Input: ["a","ab","abc","d","cd","bcd","abcd"]
 * Output: 4
 * Explanation: The two words can be "ab", "cd".
 *
 * Example 3:
 * Input: ["a","aa","aaa","aaaa"]
 * Output: 0
 * Explanation: No such pair of words.
 */
public class MaximumProductOfWordLength {
    public static int maxProduct1(String[] words) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < words.length;i++){
            String s1 = words[i];
            for(int j = i + 1; j < words.length;j++){
                String s2 = words[j];
                if(!compare(s1,s2)) max = Math.max(max, s1.length()*s2.length());
            }
        }
        return max;

    }
    public static boolean compare(String s1, String s2){
        for(int i = 0; i < s2.length(); i++){
            if(s1.contains(s2.substring(i,i+1))) return true;
        }
        return false;
    }
//    public static int maxProduct2(String[] words){
//
//    }
    public static void main(String[] args){
        String[] words1 =  {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct1(words1));

    }
}
