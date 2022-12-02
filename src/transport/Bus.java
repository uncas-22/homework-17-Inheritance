package transport;

public class Bus extends Transport {

        public Bus(String brand, String model, int year, String country, String colorBody, int speedMax) {
            super(brand, model, year, country, colorBody, speedMax);
        }

        public void refill() {
            System.out.println("Заправить дизелем");
            System.out.println("Запрпавить бензином");
        }
}
