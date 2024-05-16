package Lectures.week1.training1.chapter_27.packageOne;

public class ClassA {
    public String publicStr;

    private String privateStr;

    String defaultStr;

    public void methodPublic() {
    }

    private void methodPrivate() {

    }

    void methodDefault() {
    }

    void testPrivate() {
        String str = privateStr;
        methodPrivate();
    }
}
