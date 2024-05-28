package Lectures.week1.training1.chapter_59;

import Lectures.week1.training1.chapter_57.Customer;

import java.util.List;

public class ListUtils {
    public synchronized static void addList(List<Customer> customerList, Customer newCustomer) {
        customerList.add(newCustomer);
    }
}
