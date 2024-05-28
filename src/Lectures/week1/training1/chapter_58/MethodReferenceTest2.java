package Lectures.week1.training1.chapter_58;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest2 {
    public static void main(String[] args) {
        // Instance method reference
        Customer customer = new Customer("이순신");
        Customer customer1 = new Customer("아이유");

        Supplier<String> ex1 = customer::toString;
        Supplier<String> ex2 = customer1::toString;

        System.out.println(ex1.get());
        System.out.println(ex2.get());

        // 임의 객체 메소드 호출
        List<Customer> customerList = Arrays.asList(
                new Customer("lee"),
                new Customer("park"),
                new Customer("cho"),
                new Customer("kim")
        );
        customerList.forEach(Customer::printMyInfo);
    }
}
