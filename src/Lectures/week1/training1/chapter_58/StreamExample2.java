package Lectures.week1.training1.chapter_58;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C0001", "lee"));
        customers.add(new Customer("C0002", "park"));
        customers.add(new Customer("C0003", "kim"));
        customers.add(new Customer("C0002", "park"));
        customers.add(new Customer("C0001", "lee"));
        customers.add(new Customer("C0003", "kim"));
        customers.add(new Customer("C0001", "lee"));
        customers.add(new Customer("C0004", "jo"));

        Customer myCustomer = new Customer("C0001", "lee");
        long nums = customers.stream()
                .filter(myCustomer::equals)
                .count();

        System.out.println(nums);

        List<Integer> bonusPoints = customers.stream()
                .map(Customer::getBonusPoint)
                .collect(Collectors.toList());

        System.out.println(bonusPoints);
    }
}
