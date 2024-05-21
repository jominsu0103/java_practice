package Lectures.week1.training1.chapter_36;

public class Airplane implements Flyable {

    private String airplaneID;
    private long remainingFuelAmount;
    private long maximumCapacity;

    @Override
    public void fiy() {
        System.out.println("비행기 ID(" + airplaneID + ")가 날고있습니다.");
    }

    public void refillFuel(long fuel) {
        remainingFuelAmount += fuel;
    }

    public Airplane(String airplaneID) {
        this.airplaneID = airplaneID;
    }
}
