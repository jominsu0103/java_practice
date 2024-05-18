package assignments.week1.assignment1;

import java.util.Arrays;

public class StudentScore {

    private static int serialIndex;
    private static int[] allScores;

    private int myIndex;
    private int score;

    public static int getSerialIndex() {
        return serialIndex;
    }

    public static void setSerialIndex(int serialIndex) {
        StudentScore.serialIndex = serialIndex;
    }

    public static int[] getAllScores() {
        return allScores;
    }

    public static void setAllScores(int[] allScores) {
        StudentScore.allScores = allScores;
    }

    public int getMyIndex() {
        return myIndex;
    }

    public void setMyIndex(int myIndex) {
        this.myIndex = myIndex;
    }

    public int getScore() {
        return allScores[myIndex];
    }

    public void setScore(int score) {
        allScores[myIndex] = score;
    }

    StudentScore(int score) {
        this.score = score;
        myIndex = serialIndex;
        addAllScore(score);
        serialIndex++;
    }

    private static void addAllScore(int score) {
        if (allScores == null) {
            allScores = new int[]{score};
        } else {
            int[] newScores = Arrays.copyOf(allScores, allScores.length + 1);
            newScores[newScores.length - 1] = score;
            allScores = newScores;
        }
    }
}
