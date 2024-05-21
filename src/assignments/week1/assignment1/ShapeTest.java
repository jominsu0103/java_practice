package assignments.week1.assignment1;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("기본 원 색상 :" + circle.getColor());
        System.out.println("기본 원 차원 :" + circle.getDimension());
        circle.setColor("빨강");

        System.out.println("원의 반지름:" + circle.getRadius());
        System.out.println("원의 지름:" + circle.calculateDiameter(circle));
        System.out.println("원의 둘레:" + circle.calculateCircumference());
        System.out.println("원의 면적:" + circle.calculateArea());
        System.out.println("원의 색상:" + circle.getColor());

        System.out.println("===========================================");

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("기본 직사각형 색상: " + rectangle.getColor());
        System.out.println("기본 직사각형 차원: " + rectangle.getDimension());

        rectangle.setColor("파랑");  // 도형의 색상 설정

        System.out.println("직사각형 가로 길이: " + rectangle.getWidth());
        System.out.println("직사각형 세로 길이: " + rectangle.getHeight());
        System.out.println("직사각형 대각선 길이: " + rectangle.calculateDiagonal());
        System.out.println("직사각형 면적: " + rectangle.calculateArea());
        System.out.println("직사각형 둘레길이: " + rectangle.calculateCircumference());
        System.out.println("직사각형 색상: " + rectangle.getColor());
    }
}
