package Lectures.week1.training1.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";


        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("Cat");
        String str4 = new String("Cat");

        System.out.println(str3 == str4); // 메모리주소를 비교함
        System.out.println(str3.equals(str4)); // 안에 값을 비교함

        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);

        //원리를 이해하는것이 제일 중요
        str1 = str1 + " is"; // "Cat is"라는 값의 새로운 메모리 할당
        str1 = str1.concat(" so Cute");// "Cat is so Cute"라는 값의 새로운 메모리 할당
        str1 = str1.concat(" and");// "Cat is so Cute and"라는 값의 새로운 메모리 할당
        str1 = str1.concat(" so lovely");// "Cat is so Cute and so lovely"라는 값의 새로운 메모리 할당

        System.out.println(str1);
        //Java String은 불변성을 가진다.
    }
}
