package Lectures.week1.training1.chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {

        //남편 role
        HusbandRole male = new Male("cho");
        Wife female = new Female("sim");

        male.sayLoveEveryDay();
        male.takeCareWife(female);

        //아빠 role
        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("choJR");

        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        //회사원 role
        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        EmployeeRole maleEmployeeTwo = new MaleTwo("lee");
        EmployeeRole femaleEmployee = new Female("jun");

        maleEmployee.workTogether(femaleEmployee);
        maleEmployee.workTogether(maleEmployeeTwo);

    }
}
