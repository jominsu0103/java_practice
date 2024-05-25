package Lectures.week1.training1.chapter_54;

public class LamdaUseTest {
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10;


        GenericLamda<String> genericLamda = (str) -> str.toUpperCase();
        GenericLamda<Integer> genericLamda2 = (num) -> num * 2;
        GenericLamda<Boolean> genericLamda3 = (myBool) -> myBool & true;

        System.out.println(genericLamda.calculate("abc"));
        System.out.println(genericLamda2.calculate(100));
        System.out.println(genericLamda3.calculate(true));
        
    }

    static void printNum(MultipleNum multipleNum) {
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
}
