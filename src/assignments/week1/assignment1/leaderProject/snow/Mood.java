package assignments.week1.assignment1.leaderProject.snow;

public enum Mood {
    BAD("나쁨"),
    NORMAL("보통"),
    GOOD("좋음");

    private final String status;

    Mood(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "mood{" +
                "status='" + status + '\'' +
                '}';
    }
}
