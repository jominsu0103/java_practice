package Lectures.week1.training1.chapter_54;

public class LamdaTest1 {
    public static void main(String[] args) {
        MultipleNum multipleNum = (x) -> x * 2;
        MultipleNum multipleNum1 = (i) -> i * 2;
        MultipleNum multipleNum2 = (x) -> {
            return x * 3;
        };
        MultipleNum multipleNum3 = (int myInt) -> {
            return myInt * 4;
        };

        System.out.println(multipleNum.calculate(5));
        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(5));
        System.out.println(multipleNum3.calculate(5));

        StringNum stringNum = (x, y) -> System.out.println(x);
        StringNum stringNum1 = (x, y) -> {
            for (int i = 0; i < y; i++) {
                System.out.println(i);
            }
        };

        StringNum stringNum2 = (String x, int y) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < y; i++) {
                sb.append(x);
            }
            System.out.println(sb.toString());
        };
    }
}
