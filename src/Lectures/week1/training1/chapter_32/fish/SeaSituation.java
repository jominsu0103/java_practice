package Lectures.week1.training1.chapter_32.fish;

public class SeaSituation {
    public static void main(String[] args) {
//        FishChild fishChild = new FishChild();
//
//        fishChild.setGender("male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("EastSea");
//
//        fishChild.printMyInfo();
//
//        FishChild fishChild1 = new FishChild("female", true, "서해");
//        fishChild1.printMyInfo();

//        FishChild fishChild = new FishChild(true, "서해");
//        fishChild.printMyInfo();

//        FishChild fishChild = new FishChild();
//        fishChild.setLeavingSea("동해");
//        fishChild.setLeavingSeaChild("서해");
//
//        fishChild.printSea();

        //핵심
        //타입 선언 부모 , 인스턴스화 자식
        //타입 선언 부모 , 인스턴스화 부모
        //타입 선언 자식 , 인스턴스화 자식
        //타입 선언 자식 , 인스턴스화 부모 => 묵시적 변환 x

        Fish fish = new Fish();
        fish.eat("새우");

        Fish fish1 = new FishChild();
        fish1.eat("새우");

        FishChild fishChild = new FishChild();
        fishChild.eat("새우");

//        FishChild fishChild1 = new Fish();
    }
}
