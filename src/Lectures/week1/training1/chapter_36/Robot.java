package Lectures.week1.training1.chapter_36;

public class Robot implements Walkable {
    private String robotID;
    private String modelName;
    private String color;

    public String getRobotID() {
        return robotID;
    }

    public void setRobotID(String robotID) {
        this.robotID = robotID;
    }

    @Override
    public void walk() {
        System.out.println("로봇ID(" + robotID + ")가 걷고 있습니다.");
    }

    public void helpPerson(Person person, Robot robot) {
        String ID = robot.getRobotID();
        String name = person.getName();
        System.out.println("로봇(" + ID + ")이 인간 " + name + "을(를) 돕습니다.");
    }

    public Robot(String robotID) {
        this.robotID = robotID;
    }
}
