package homeworkLesson5Tasck1;

public enum Sity {
    Kiev(0), Lviv(513), Madrid(3306), Rome(2195), Poland(880), Litva(820);

    private int distance;

    private Sity(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
