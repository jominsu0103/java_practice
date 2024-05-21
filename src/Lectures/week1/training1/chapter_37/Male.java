package Lectures.week1.training1.chapter_37;

public class Male extends FamilyMan implements FamilyRole, EmployeeRole {
    private int age;
    private String job;


    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 진행하고 있다.");
    }

    @Override
    public String getName() {
        return this.name;
    }


    public Male(String name) {
        this.name = name;
    }
}
