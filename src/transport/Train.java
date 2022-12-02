package transport;

public class Train extends Transport {
    private int priceTrip;
    private int timeTrip;
    private String departureStation;
    private String finalStop;
    private int numberOfWagons;


    public Train(String brand, String model, int year, String country, String colorBody, int speedMax, String departureStation, String finalStop, int priceTrip, int numberOfWagons, int timeTrip) {
        super(brand, model, year, country, colorBody, speedMax);
        setPriceTrip(priceTrip);
        setTimeTrip(timeTrip);
        setDepartureStation(departureStation);
        setFinalStop(finalStop);
        setNumberOfWagons(numberOfWagons);
        setTimeTrip(timeTrip);

    }

    public void refill() {
        System.out.println("Заправить дизелем");
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        if (priceTrip > 0) {
            this.priceTrip = priceTrip;
        }
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        if (timeTrip > 0) {
            this.timeTrip = timeTrip;
        } else {
            this.timeTrip = 0;
        }
    }

    public String getDepartureStation() {
        return this.departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation != null && !departureStation.isBlank() && !departureStation.isEmpty()) {
            this.departureStation = departureStation;
        } else {
            this.departureStation = "некорректные данные";
        }
    }

    public String getFinalStop() {
        return this.finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null && !finalStop.isEmpty() && !finalStop.isBlank()) {
            this.finalStop = finalStop;
        } else {
            this.finalStop = "некорректные данные";
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons > 0) {
            this.numberOfWagons = numberOfWagons;
        } else {
            this.numberOfWagons = 0;
        }
    }

    public String toString() {

        return super.toString() +
                " Отходит от " + getDepartureStation() + " и следует до станции " + getFinalStop() +
                ". Цена поездки -" + getPriceTrip() + " рублей, в поезде " + getNumberOfWagons() + " вагонов.";

    }
}
