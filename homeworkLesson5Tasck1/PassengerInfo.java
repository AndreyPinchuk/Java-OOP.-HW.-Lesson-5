package homeworkLesson5Tasck1;

public class PassengerInfo {
    private final String name;
    private final String surname;
    private final String nambPasport;

    public PassengerInfo(String name, String surname, String nambPasport) {
        this.name = name;
        this.surname = surname;
        this.nambPasport = nambPasport;
    }

    @Override
    public String toString() {
        return "\n" + "  Пасажир{" + name + " " + surname +
                ", номер паспорта='" + nambPasport + '\'' +
                '}';
    }
}
