package Lectures.week1.training1.chapter_58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C0001", "lee"));
        customers.add(new Customer("C0002", "park"));
        customers.add(new Customer("C0003", "kim"));
        customers.add(new Customer("C0004", "jo"));

        customers.stream()
                .map(Customer::getName)
                .filter(StringUtil::isLongName)
                .forEach(System.out::println);

        List<String> customerNames = Arrays.asList(
                "lee",
                "min",
                "oh",
                "sim"
        );

        List<Customer> customerList = customerNames.stream()
                .map(Customer::new)
                .collect(Collectors.toList());

        System.out.println(customerList);
    }
}
