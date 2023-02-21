package kg.kadyrbekov.programmingSkills;

import java.util.HashMap;
import java.util.Map;

public class FreqAlphabet {
    public static void main(String[] args) {
//        System.out.println(freqAlphabet("10#11#12"));

        String encryptedString = "10#11#12";
        String decryptedString = decryptString(encryptedString);
        System.out.println(decryptedString); // Output: "wcL"
    }

    public static String decryptString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            // Check if the next two characters are digits and a hash symbol
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                sb.append((char) ('a' + num - 1));
                i += 3;
            } else {
                int num = Integer.parseInt(s.substring(i, i + 1));
                sb.append((char) ('a' + num - 1));
                i += 1;
            }
        }
        return sb.toString();
    }
}



