package Strings;

public class CountWords {
    public static void main(String[] args) {

        String sentence = "Techie Associates Java Training";
        int countWords = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                countWords++;
            }
        }

        System.out.println("Number of words: " + countWords);
    }
}
