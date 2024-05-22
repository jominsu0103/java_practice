package Lectures.week1.training1.chapter_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        // Set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        // Add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");

        System.out.println("fruitSet: " + fruitSet);

        // add 중복 Add x
        fruitSet.add("Melon");
        System.out.println("fruitSet: " + fruitSet);

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Grape");
        fruitList.add("Apple");

        System.out.println("fruitList " + fruitList);

        // remove(set)
        fruitSet.remove("Apple");
        System.out.println("fruitSet: " + fruitSet);

        // contains
        System.out.println("Apple 있는지 " + fruitSet.contains("Apple"));
        System.out.println("Mango 있는지 " + fruitSet.contains("Mango"));

        // Size , isEmpty, Clear
        System.out.println("size" + fruitSet.size());

        fruitSet.clear();
        System.out.println("비었는지" + fruitSet.isEmpty());
        System.out.println("fruitSet: " + fruitSet);
    }
}
