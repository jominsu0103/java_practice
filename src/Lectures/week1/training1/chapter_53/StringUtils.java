package Lectures.week1.training1.chapter_53;

public class StringUtils {
    public static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static class CharChecker {
        public static int countChar(String str, char target) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    count++;
                }
            }
            return count;
        }

        public static boolean containChar(String str, char target) {
            return countChar(str, target) >= 1;
        }
    }

}
