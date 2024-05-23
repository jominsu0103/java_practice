package assignments.week1.assignment1;

public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("0으로는 나눌 수 없습니다.");
    }
}
