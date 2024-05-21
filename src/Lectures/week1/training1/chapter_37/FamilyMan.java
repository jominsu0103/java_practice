package Lectures.week1.training1.chapter_37;

public abstract class FamilyMan implements FamilyRole {
    protected String name;

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + "인 아내를 성실히 케어한다.");
    }

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + " 아기를 열심히 교육하고 있다.");
    }
}
