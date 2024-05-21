package Lectures.week1.training1.chapter_37;

public class Female implements EmployeeRole, Wife {
    private String name;
    private String job;
    private int age;

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 진행하고 있다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void takeCareHusband(HusbandRole husbandRole) {
        String name = husbandRole.getName();
        System.out.println(name + "인 남편을 케어한다.");
    }

    public Female(String name) {
        this.name = name;
    }
}
