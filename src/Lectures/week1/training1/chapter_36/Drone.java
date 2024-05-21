package Lectures.week1.training1.chapter_36;

public class Drone implements Flyable {
    private String droneID;
    private long remainingFuleAmount;
    private long remainingFileStorage;

    public void takePicture() {
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }
}
