package homeworkLesson5Tasck1;

public class TicketRunner {
    public static void main(String[] args) {

        PassengerInfo passenger1 = new PassengerInfo("Dmitriy", "Gruba", "PC 234885");

        PassengerInfo passenger2 = new PassengerInfo("Bob", "Salinski", "MS 234544");
        Baggage baggageP2 = new Baggage(15, 2);
        Meal mealP2 = new Meal(Food.FirstMenu, true, 5);

        Ticket ticket1 = new Ticket(122, Sity.Kiev, Sity.Lviv, "12:20", 47, 5, 747, passenger1);

        VipTicket vipTicket1 = new VipTicket(122, Sity.Kiev, Sity.Lviv, "12:20", 5, 7, 747, passenger2, baggageP2, mealP2);

        System.out.println(ticket1);
        System.out.println(ticket1.getPrice() + " грн.");
        System.out.println();
        System.out.println(vipTicket1);
        System.out.println(vipTicket1.getPrice() + " грн.");

    }
}
/*
Ticket{номер самолёта=747
  Пасажир{Dmitriy Gruba, номер паспорта='PC 234885'}
    Информация о полете{номер рейса=122, место отправки=Kiev, место призимления=Lviv, время отправки='12:20', № места=47, цена за 1км=5}}
2565 грн.
VipTicket{Ticket{номер самолёта=747
  Пасажир{Bob Salinski, номер паспорта='MS 234544'}
    Информация о полете{номер рейса=122, место отправки=Kiev, место призимления=Lviv, время отправки='12:20', № места=5, цена за 1км=7}}
           Багаж{цена за едыницу=15, количество=2, всего за багаж=30}
            Еда{меню=FirstMenu, напиток есть=true, цена напитка=5}}
3721 грн.
Process finished with exit code 0
*/
