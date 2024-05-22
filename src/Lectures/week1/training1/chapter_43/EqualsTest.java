package Lectures.week1.training1.chapter_43;

import Lectures.week1.training1.chapter_34.Customer;

public class EqualsTest {
    public static void main(String[] args) {
        Customer customer = new Customer("ID1", "민철");
        Customer customer1 = customer;

        Customer customer2 = new Customer("ID1", "민철");
        Customer customer3 = new Customer("ID2", "철민");

        System.out.println(customer);
        System.out.println(customer2);

        System.out.println(customer.equals(customer1));

        System.out.println(customer.equals(customer2));

        System.out.println(customer == customer3);
        System.out.println(customer == customer2);
    }
}
