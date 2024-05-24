package Lectures.week1.training1.chapter_53;

public class StringUtilTest {
    public static void main(String[] args) {
        String str = "Hello World";
        char target = 'o';
        //1. 문자열이 비어있는지 확인
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println(isEmpty);
        //2. 문자열을 반대로 뒤집기
        String reverseString = StringUtils.reverse(str);
        System.out.println(reverseString);
        //3. 주어진 문자열에서 특정 문자의 개수 세기
        int count = StringUtils.CharChecker.countChar(str, target);
        System.out.println(count);
        //4. 주어진 문자열에 특정 문자가 있는지 확인
        boolean containChar = StringUtils.CharChecker.containChar(str, target);
        System.out.println(containChar);
    }
}
