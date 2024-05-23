package Lectures.week1.training1.chapter_52;

import java.util.Optional;

public class OptionalDefaultTest {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optionalS = Optional.ofNullable(str);

        int length = optionalS.orElseGet(() -> "").length();

        System.out.println(length);
    }
}
