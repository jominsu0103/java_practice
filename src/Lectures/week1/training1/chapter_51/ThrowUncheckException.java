package Lectures.week1.training1.chapter_51;

public class ThrowUncheckException {
    public static void main(String[] args) {
        System.out.println("main method run");

//        int myInt = 0;
//        try {
//            myInt = getIntElement(10);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Int : " + myInt);

        int myInt = 0;
        try {
            myInt = getDivide(0);
        } catch (Exception e) {
            System.out.println("예외 처리함");
            e.printStackTrace();
        }
        System.out.println("int:" + myInt);


        System.out.println("main method stop");

    }

    static int getIntElement(int index) throws Exception {
        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if (index >= arrInt.length) {
            throw new Exception("index는 arrInt의 길이를 넘을 수 없다.");
        }

        return arrInt[index];
    }

    static int getDivide(int num) throws Exception {
        if (num == 0) throw new Exception("num은 0이 될 수 없습니다.");
        int data = 100 / num;


        return data;
    }
}
