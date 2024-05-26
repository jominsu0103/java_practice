package Lectures.week1.training1.chapter_55;

import java.util.ArrayList;
import java.util.List;

public class TrevelTest {
    public static void main(String[] args) {
        List<TravelCustomer> customers = new ArrayList<>();
        customers.add(new TravelCustomer("cho", 29, 200000));
        customers.add(new TravelCustomer("sim", 28, 180000));
        customers.add(new TravelCustomer("park", 36, 250000));
        customers.add(new TravelCustomer("kim", 32, 220000));
        customers.add(new TravelCustomer("lee", 24, 190000));

        // 1. 고객 명단 추가된 순서로 출력
        customers.stream().map((customer) -> customer.getName()).forEach((name) -> System.out.println(name));

        // 2. 총 고객들의 여행 비용 계산
        long total = customers.stream().map((customer) -> customer.getPrice()).mapToInt(i -> i).sum();

        System.out.println(total);
    }
}
