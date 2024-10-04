package collections.JavaBasicsKA;

import java.util.HashSet;

class LenNonRepeativeCharacters {
  //  public:


    public static int lengthOfLongestSubString(String s){
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        for (int end =0;end<s.length();end++) {
            char currentChar = s.charAt(end);
            //If current character is already in the set, remove it from the start
            while (set.contains(currentChar)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(currentChar);
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {

        String s = "abcabcbb";
        int result = lengthOfLongestSubString(s);
        System.out.println("Longest substring with repeating characters: "+result);


    }
}
