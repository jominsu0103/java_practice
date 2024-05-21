package Lectures.week1.training1.chapter_36;

public class InterfaceTest2 {
    public static void main(String[] args) {
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("ab001");

        drone.fiy();
        airplane.fiy();

        if (drone instanceof Drone) {
            Drone drone1 = new Drone();
            drone1.takePicture();
        }
    }

}
