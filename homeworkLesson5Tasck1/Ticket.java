package homeworkLesson5Tasck1;

public class Ticket extends FlightInfo {
    private int nambPlane;
    private PassengerInfo passenger;

    public Ticket(int nambReys, Sity startSity, Sity finishSity, String time, int nambPlace, int priceForKm, int nambPlane, PassengerInfo passenger) {
        super(nambReys, startSity, finishSity, time, nambPlace, priceForKm);
        this.nambPlane = nambPlane;
        this.passenger = passenger;
    }

    @Override
    public int getPrice() {
        return getPriceForKm() * (getFinishSity().getDistance() - getStartSity().getDistance());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "номер самолёта=" + nambPlane + passenger + super.toString() +
                '}';
    }
}
