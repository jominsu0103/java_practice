package Lectures.week1.training1.chapter_45;

public class WrapperClassTest {
    public static void main(String[] args) {
        //Integer

        // null을 넣어야 하는 상태라면 객체인 Integer
        // int는 null x

        Integer integer = new Integer(20); // int => Integer boxing
        Integer integer1 = new Integer(30);

        int int1 = integer.intValue(); // Unboxing , Integer => int 바꾼 것

//        System.out.println(integer);
//        System.out.println(int1);

        Integer integer2 = 20; // AutoBoxing, new Integer(20)
        int int2 = integer2; // AutoUnboxing

//        System.out.println(integer2);
//        System.out.println(int2);

        //연산

//        System.out.println(integer + integer1);
//        System.out.println(integer + int1);

        // Character
        Character character = new Character('X'); // 'X' charType -> Character 박싱
        char ch1 = character.charValue(); // Character => char 언박싱

        Character character1 = 'X';
        char ch2 = character1;

        System.out.println(character);
        System.out.println(ch1);

        Character[] characters = {
                'a', 'b', 'c'
        };
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(characters);
        String str1 = String.valueOf(chars);
        System.out.println(str); //[Ljava.lang.Character;@35bbe5e8
        System.out.println(str1); //abc

        // Boolean Type
        Boolean boolean1 = new Boolean(true); // true boolean => Boolean
        boolean b1 = boolean1.booleanValue();

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2); // 출력값 false
        System.out.println(boolean1 | boolean2); // 출력값 true


    }
}
