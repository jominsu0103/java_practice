package Lectures.week1.training1.chapter_61;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MyAnnotation {
    String name();

    int count() default 0;
}
