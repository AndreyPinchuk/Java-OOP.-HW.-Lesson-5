package homeworkLesson5Tasck1;

public enum Food {
    FirstMenu(20), SecondMenu(30), Disert(35);

    private int price;

    private Food(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
