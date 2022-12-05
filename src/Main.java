import com.sun.jdi.connect.Transport;
import transport.Bus;
import transport.Car;
import transport.Train;
public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "России", "желтый", 170, "МКПП", "седан", "а858ми");
        Car audi = new Car("Audi", "A8 50L TDI quattro", 2020, "Германии", "металик", 200, "АКПП", "кроссовер", "а888аа");
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черный", 250, "АКПП", "", "л745от");
        Car kia = new Car("Kia", "Sportage", 2018, "Южной Корее", "", 185, "МКПП", "универсал", "в656ав");
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "красный", 185, "", "универсал", "");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        audi.refill();
        System.out.println("\n");

        Bus daewoo = new Bus("DAEWOO", "BS090", 2002, "Южной Корее", "красный", 175);
        Bus isuzu = new Bus("ISUZU", "А-092Н6", 1999, "Японии", "желтый", 175);
        Bus mercedes = new Bus("MERCEDES", "Conecto G", 2008, "Германии", "желтый", 175);

        System.out.println(daewoo);
        System.out.println(isuzu);
        System.out.println(mercedes);
        isuzu.refill();
        System.out.println("\n");

        Train lastochka = new Train("Ласточка", "В-901", 2011, "России", "синий", 301, "", "", 1500, 1, 20);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", "", 270, "Ленинградский вокзал", "Ленинград-Пассажирский", 1700, 8, 45);
        lastochka.setNumberOfWagons(11);
        lastochka.setPriceTrip(3500);
        lastochka.setDepartureStation("Белорусский вокзал");
        lastochka.setFinalStop("Минск-Пассажирский");

        System.out.println(lastochka);
        System.out.println(leningrad);
    }
}