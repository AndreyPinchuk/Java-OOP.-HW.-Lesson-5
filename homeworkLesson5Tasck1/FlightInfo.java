package homeworkLesson5Tasck1;

public abstract class FlightInfo {
    private int nambReys;
    private Sity startSity;
    private Sity finishSity;
    private String time;
    private int nambPlace;
    private int priceForKm;

    public FlightInfo(int nambReys, Sity startSity, Sity finishSity, String time, int nambPlace, int priceForKm) {
        this.nambReys = nambReys;
        this.startSity = startSity;
        this.finishSity = finishSity;
        this.time = time;
        this.nambPlace = nambPlace;
        this.priceForKm = priceForKm;
    }

    public abstract int getPrice();

    public Sity getStartSity() {
        return startSity;
    }

    public Sity getFinishSity() {
        return finishSity;
    }

    public int getPriceForKm() {
        return priceForKm;
    }


    @Override
    public String toString() {
        return "\n" + "    Информация о полете{" +
                "номер рейса=" + nambReys +
                ", место отправки=" + startSity +
                ", место призимления=" + finishSity +
                ", время отправки='" + time + '\'' +
                ", № места=" + nambPlace +
                ", цена за 1км=" + priceForKm +
                '}';
    }
}
