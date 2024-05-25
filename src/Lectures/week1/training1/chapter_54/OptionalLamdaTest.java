package Lectures.week1.training1.chapter_54;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLamdaTest {
    public static void main(String[] args) {
        String str = "abc";

        Optional<String> stringOptional = Optional.ofNullable(str);

        Supplier<String> stringSupplier = () -> "default";

        String str2 = stringOptional.orElseGet(stringSupplier).toUpperCase();

        System.out.println(str2);
    }
}
