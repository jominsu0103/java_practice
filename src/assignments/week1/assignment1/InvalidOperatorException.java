package assignments.week1.assignment1;

public class InvalidOperatorException extends Exception {
    public InvalidOperatorException() {
        super("유효하지 않은 연산자가 입력되었습니다.");
    }
}
