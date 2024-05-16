package Lectures.week1.training1.chapter_27.packageTwo;

import Lectures.week1.training1.chapter_27.packageOne.ClassA;

public class ClassB {
    public void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();

    }

//    void testPrivate(ClassA classA){
//        String str = classA.privateStr;
//        classA.methodPrivate();
//    }
//    void testDefault(ClassA classA){
//        String str = classA.defaultStr;
//        classA.methodDefault();
//    }
}
