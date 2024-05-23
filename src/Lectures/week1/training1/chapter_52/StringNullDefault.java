package Lectures.week1.training1.chapter_52;

public class StringNullDefault {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생 기본값 사용");
            str = "";
            int length = str.length();
            System.out.println(length);
        }
    }
}
