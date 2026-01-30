package Strings;

import org.testng.annotations.Test;

public class StringReversal {

    @Test
    public void reverseEachWordInString() {
        String sentence = "Hare Krishna Hare Krishna Krishna Krishna Hare Hare";
        System.out.println(sentence);
        String[] wordArray = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for (int i = 0; i < wordArray.length; i++) {
            reversedSentence.append(reverseString(wordArray[i]));
            if (i < wordArray.length - 1) {
                reversedSentence.append(" ");
            }
        }
        System.out.println(reversedSentence.toString());
    }

    public String reverseString(String str) {
        char[] chararray = str.toCharArray();
        int n = chararray.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = chararray[i];
            chararray[i] = chararray[n - 1 - i];
            chararray[n - 1 - i] = temp;
        }

        return new String(chararray);
    }
}
