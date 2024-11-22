package advConcept;

import java.lang.reflect.Array;

public class validanagram {

    static boolean anagram(String s, String t){
        if (s.length() != t.length()) return false;

        int[] charCount = new int[26];
        for(int i = 0; i < s.length();i++){
            charCount[s.charAt(i)-'a']++;
            charCount[t.charAt(i)-'a']--;
        }

        for(int arr: charCount){
            if(arr != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String t = "zyxwvutsrqponmlfkjihgedcba";

        System.out.println(anagram(s,t));

    }
}
