package assignments.week1.assignment1.leaderProject;

public class SneakersInfo {
    private String feature;
    private long price;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public SneakersInfo(String feature, long price) {
        this.feature = feature;
        this.price = price;
    }
}
