package streamApi;

import java.util.*;

class Test {
    private String name;
    private int score;
    private String rank;
    public Test(String name, int score, String rank) {
        this.name = name;
        this.score = score;
        this.rank = rank;
    }
    public int getScore() {
        return score;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getRank() {
        return rank;
    }
    public String toString() {
        return name + ":" + rank;
    }
}

class Test6_8 {
    public static void main(String[] args) {
        List<Test> list = List.of(new Test("Duke", 80, "Silver"),
                                   new Test("James", 60, "Silver"),
                                   new Test("Sccot", 90, "Silver"));
        list.stream()
            .filter(c -> c.getScore() > 70)
            .forEach(c -> c.setRank("Gold"));
        list.stream()
            .forEach(System.out::println);
    }
}