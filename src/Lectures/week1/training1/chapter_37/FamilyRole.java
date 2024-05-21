package Lectures.week1.training1.chapter_37;

public interface FamilyRole extends DaddyRole, HusbandRole {

    @Override
    default void sayLoveEveryDay() {
        DaddyRole.super.sayLoveEveryDay();
        HusbandRole.super.sayLoveEveryDay();
    }

}
