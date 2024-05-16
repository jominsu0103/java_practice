package Lectures.week1.training1.chapter_21;

public class CmdLineArgs {
    //외부 변수받을 클래스
    public static void main(String[] args) {
        System.out.println(args.length);

        System.out.printf("첫 번째 인자는:%s\n", args[0]);
        System.out.printf("두 번째 인자는:%s\n", args[1]);
    }
}
