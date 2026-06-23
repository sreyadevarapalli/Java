package Interview_Questions;

import java.util.LinkedHashMap;

public class NonRepeated {
    public static void main(String[] args) {

        String str = "aabbcde";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeated Character = " + ch);
                break;
            }
        }
    }
}
