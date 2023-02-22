package kg.kadyrbekov.programmingSkills;

public class CheckIfOneString {
    public static void main(String[] args) {
        System.out.println(canStringsBeEqual("bank", "kanb"));
    }

    public static boolean canStringsBeEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int diffCount = 0;
        int[] diffIndexes = new int[2];

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffCount >= 2) {
                    return false;
                }
                diffIndexes[diffCount] = i;
                diffCount++;
            }
        }

        if (diffCount == 0) {
            return true;
        }

        if (diffCount == 1) {
            return false;
        }

        if (s1.charAt(diffIndexes[0]) == s2.charAt(diffIndexes[1]) && s1.charAt(diffIndexes[1]) == s2.charAt(diffIndexes[0])) {
            return true;
        }

        return false;
    }


}
