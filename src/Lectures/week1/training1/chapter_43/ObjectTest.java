package Lectures.week1.training1.chapter_43;

import Lectures.week1.training1.chapter_34.Customer;
import Lectures.week1.training1.chapter_34.GoldCustomer;

public class ObjectTest {
    public static void main(String[] args) {
        Customer customer = new Customer("민철");

        GoldCustomer goldCustomer = new GoldCustomer("철민");

        System.out.println(customer);
        System.out.println(goldCustomer);
    }
}
