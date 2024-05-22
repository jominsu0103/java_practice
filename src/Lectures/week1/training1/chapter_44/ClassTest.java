package Lectures.week1.training1.chapter_44;

import Lectures.week1.training1.chapter_34.Customer;

import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("민철");
        Class clazz = customer.getClass();
//        Class clazz2 = Customer.class;

//        Constructor[] constructors = clazz.getConstructors();
//        for (Constructor constructor : constructors) {
//            System.out.println(constructor);
//        }

//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

        //접근제어자가 public인 것들만 가져올 수 있음.
//        Field[] fields = clazz.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

        //모든 필드를 가져올 수 있음
//        Field[] fields1 = clazz.getDeclaredFields();
//        for (Field field : fields1) {
//            System.out.println(field);
//        }

        Customer customer1 = (Customer) clazz.getConstructor(String.class).newInstance("민철");
        System.out.println(customer1);
    }
}
