package Lectures.week1.training1.chapter_44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        //CharArray => String
        char[] chars = {'a', 'b', 'c'};

        //
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        // Str => CharArray
        char[] chars1 = str1.toCharArray();
        for (char ch : chars1) {
            System.out.println(ch);
        }
        System.out.println("==============");

        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        // 에러 확인을 위한 System.out.println(str1.charAt(3));
    }
}
