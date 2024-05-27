package assignments.week1.assignment1.leaderProject.snow;

public enum CustomerRank {
    VIP("vip 등급 고객"),
    GOLD("gold 등급 고객"),
    SILVER("silver 등급 고객");

    private final String koreanName;

    public String getKoreanName() {
        return koreanName;
    }

    CustomerRank(String koreanName) {
        this.koreanName = koreanName;
    }

    @Override
    public String toString() {
        return "CustomerRank{" +
                "koreanName='" + koreanName + '\'' +
                '}';
    }
}
