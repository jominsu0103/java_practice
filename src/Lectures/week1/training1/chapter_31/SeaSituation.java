package Lectures.week1.training1.chapter_31;

public class SeaSituation {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setGender("male");
        fish.setLeavingSea("EastSea");
        fish.setHavingPoison(false);

        FishChild fishChild = new FishChild();
        fishChild.setGender("female");
        fishChild.setLeavingSea("NorthSea");
        fishChild.setHavingPoison(false);
        fishChild.setEatable(true);

//        fish.printMyInfo();
//        fishChild.printMyInfo();
//
//        fishChild.digging();

        fishChild.becomeDanger();
        System.out.println("독성여부:" + fishChild.isHavingPoison());
        System.out.println(fishChild.isEatable());

        fish.eat("새우");
        fishChild.eat("새우");

    }
}
