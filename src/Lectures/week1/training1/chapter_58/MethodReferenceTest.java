package Lectures.week1.training1.chapter_58;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    //static method
    public static void main(String[] args) {
        Consumer<String> ex1 = Printer::printSomething;

        ex1.accept("method reference 사용");

        // 생성자 호출 (빈 파라미터)
        Supplier<Customer> ex2 = Customer::new;

        System.out.println(ex2.get());

        // 파라미터
        Function<String, Customer> ex3 = Customer::new;

        System.out.println("name parameter 생성자 : " + ex3.apply("이순신"));

    }
}
