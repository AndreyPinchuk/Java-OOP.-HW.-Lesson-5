package homeworkLesson5Tasck1;

public class Baggage {
    private final int priceone;
    private int amount;

    public Baggage(int priceone, int amount) {
        this.priceone = priceone;
        this.amount = amount;
    }

    public int getPrice(int priceone, int amount) {
        return priceone * amount;
    }

    public int getPriceone() {
        return priceone;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "           Багаж{" +
                "цена за едыницу=" + priceone +
                ", количество=" + amount +", всего за багаж="+priceone*amount+
                '}';
    }
}
