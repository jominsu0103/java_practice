package assignments.week1.assignment1;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        char operator;


        try {
            num1 = 20;
            num2 = 0;
            operator = '/';
            int calculateResult = calculate(num1, num2, operator);
            System.out.println("결과 출력 : " + calculateResult);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }
    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new DivideByZeroException();
                }
                result = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        return result;
    }
}
