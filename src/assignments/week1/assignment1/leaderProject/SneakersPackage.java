package assignments.week1.assignment1.leaderProject;

public class SneakersPackage {
    private Sneakers sneakers;

    public Sneakers getSneakers() {
        return sneakers;
    }

    public void setSneakers(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

    public Sneakers beUnBoxing() {
        return sneakers;
    }

    public SneakersPackage(Sneakers sneakers) {
        this.sneakers = sneakers;
    }
}
