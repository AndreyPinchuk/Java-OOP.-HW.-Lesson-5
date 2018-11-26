package homeworkLesson5Tasck1;

public class Meal {
    private Food food;
    private boolean drink;
    private int price;

    public Meal(Food food, boolean drink, int price) {
        this.food = food;
        this.drink = drink;
        this.price = price;
    }

    public int getPrice(Food food, boolean drink, int price) {
        if (drink) {
            return price * food.getPrice();
        } else {
            return food.getPrice();
        }
    }

    public Food getFood() {
        return food;
    }

    public boolean isDrink() {
        return drink;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "            Еда{" +
                "меню=" + food +
                ", напиток есть=" + drink +
                ", цена напитка=" + price +
                '}';
    }
}
