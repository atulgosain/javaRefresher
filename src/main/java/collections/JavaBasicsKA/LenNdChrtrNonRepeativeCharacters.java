package collections.JavaBasicsKA;

import java.util.HashSet;

class LenNdChrtrNonRepeativeCharacters {
  //  public:


    public static String[] lengthOfLongestSubString(String s){
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int subStringStart = 0;
        String longestSubString ="";
        int end;

        for ( end =0;end<s.length();end++) {
            char currentChar = s.charAt(end);
            //If current character is already in the set, remove it from the start
            while (set.contains(currentChar)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(currentChar);
            if (end-start+1> maxLength) {
                maxLength = end - start + 1;
                subStringStart =start;
                longestSubString =s.substring(start,end+1);
            }
        }
        return new String[]{longestSubString,String.valueOf(start)};
    }
    public static void main(String[] args) {

        String s = "abcabcbb";
        String[] result = lengthOfLongestSubString(s);
        System.out.println("Longest substring with repeating characters: "+result[0]);
            System.out.println("length: "+result[1]);


    }
}
