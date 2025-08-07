package palle.satishsir;

import java.util.Map;
import java.util.HashMap;

public class Test {

    static void stringReverse() {
        String s = "Palle";
//        int count = s.length();
//        for (int i = count - 1; i >= 0; i--) {
//            System.out.print(s.charAt(i));
//        }

        String t = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }

        System.out.println(t);

    }


    static void isPalindrome() {
        String s = "MALAALAM";
        boolean flag = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                flag = false;
            }
        }
        System.out.println(flag);
    }

    static void countVowels() {
        String s = "What bro this is very wrong bro..";
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        System.out.println("Total Vowels: " + count);

    }


    static void countWords() {
        String s = "hello dill wale dill dunia  ley jayengi";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Total words: " + count);
    }

    static void arrayBigEvenBigOdd() {
        int[] arr = {1, 2, 4, 5, 3, 6, 34, 6, 43, 236, 56};

        int bigEven = 0;
        int bigOdd = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > bigEven) {
                    bigEven = arr[i];
                }
            } else if (arr[i] % 2 == 1) {
                if (arr[i] > bigOdd) {
                    bigOdd = arr[i];
                }
            }
        }
        System.out.println("Bid even: " + bigEven);
        System.out.println("Bid odd: " + bigOdd);
    }

    static void mapIntro() {


        HashMap<String, String> hp = new HashMap<>();

        hp.put("Tharuntechis@gmail.com", "122345");


    }

    static void mapQuestion() {

        HashMap<Character, Integer> dict = new HashMap<>();

        dict.put('i', 10);
        dict.put('j', 20);
        dict.put('i', 30);

        System.out.println(dict.get('j'));

        System.out.println(dict.containsKey('i'));

        System.out.println(dict.containsValue(20));

        System.out.println(dict);
    }


    static void mapQuestion2() {

        Map<Integer, Integer> dict = new HashMap<>();


        for (int i = 1; i <= 10; i++) {
            dict.put(i, 10 - i);
        }

        System.out.println(dict);

        System.out.println(dict.get(10));
        System.out.println(dict.containsKey(10));

        if (dict.containsKey(10) == true) {
            dict.put(10, dict.get(10) + 1);
        }

        System.out.println(dict.get(10));


    }

    public static void main(String[] args) {
        mapQuestion2();


    }
}
