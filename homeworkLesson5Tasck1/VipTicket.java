package homeworkLesson5Tasck1;

public class VipTicket extends Ticket {
    private Baggage baggage;
    private Meal meal;

    public VipTicket(int nambReys, Sity startSity, Sity finishSity, String time, int nambPlace, int priceForKm, int nambPlane, PassengerInfo passenger, Baggage baggage, Meal meal) {
        super(nambReys, startSity, finishSity, time, nambPlace, priceForKm, nambPlane, passenger);
        this.baggage = baggage;
        this.meal = meal;
    }

    public int getPrice() {
        return (getPriceForKm() * (getFinishSity().getDistance() - getStartSity().getDistance())) + baggage.getPrice(baggage.getPriceone(), baggage.getAmount()) + meal.getPrice(meal.getFood(), meal.isDrink(), meal.getPrice());
    }

    @Override
    public String toString() {
        return "VipTicket{" + super.toString() +
                "\n" + baggage +
                "\n" + meal +
                '}';
    }
}
