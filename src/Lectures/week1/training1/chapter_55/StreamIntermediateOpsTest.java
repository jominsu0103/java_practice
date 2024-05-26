package Lectures.week1.training1.chapter_55;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        // filter fruit 이름의 길이가 6이상인 과일만 선택
        fruits.stream().filter((fruit) -> fruit.length() >= 6).forEach((fruit -> System.out.println("필터 적용 " + fruit)));

        // distinc : 중복된 과일 제거
        List<String> fruitList = fruits.stream().distinct().collect(Collectors.toList());

        System.out.println("distinc 적용 전 " + fruits);
        System.out.println("distinc 적용 후 " + fruitList);

        //map : 과일 이름 대문자로 변환
        List<String> fruitListMap = fruits.stream().map((fruit) -> fruit.toUpperCase()).collect(Collectors.toList());
        List<Integer> fruitListMap2 = fruits.stream().map((fruit) -> fruit.length()).collect(Collectors.toList());

        System.out.println("map 이후 " + fruitListMap2);

        //Limit : 처음 3개의 과일만 선택
        List<String> fruitList3 = fruits.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limit 이후 " + fruitList3);

        //Skip 처음 3개의 과일을 제외한 나머지 과일 선택
        List<String> fruitList4 = fruits.stream().skip(3).collect(Collectors.toList());
        System.out.println("Skip 이후 " + fruitList4);

        //sorted 과일을 알파벳 순으로 정렬
        List<String> fruitList5 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("알파벳 " + fruitList5);

        //sorted String 길이 짧은 순으로 정렬
        List<String> fruitList6 = fruits.stream().sorted((fruit1, fruit2) -> fruit1.length() - fruit2.length()).collect(Collectors.toList());
        System.out.println("길이 짧은 순 " + fruitList6);
    }
    
}
