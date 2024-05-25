package Lectures.week1.training1.chapter_54;

public class LamdaTest2 {
    public static void main(String[] args) {
        MultipleNum multipleNum = num -> num * 1;

        StringNum StringNum2 = new StringNum() {
            @Override
            public void printString(String str, int num) {
                for (int i = 0; i < num; i++) {
                    System.out.println(str);
                }
            }
        };
    }
}
