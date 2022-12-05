package transport;
import java.util.regex.Pattern;
public class Car extends Transport {
    private String transmission;
    private String bodyType;
    private String registrationNumber;

    public Car(String brand, String model, int year, String country, String colorBody, int speedMax, String transmission, String bodyType, String registrationNumber) {
        super(brand, model, year, country, colorBody, speedMax);
        setTransmission(transmission);
        setBodyType(bodyType);
        setRegistrationNumber(registrationNumber);
    }

    public void refill() {
        System.out.println("Заправить бензином");
        System.out.println("Заправить дизелем");
        System.out.println("Зарядить электрокар");
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}", registrationNumber)) {
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println("номер некорректный");
            this.registrationNumber = "не тот формат";
        }
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isBlank() && !transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "данные не верные";
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            System.out.println("некорректные данные типа кузова");
            this.bodyType = "некорректные данные";
        }
    }

    public String toString() {
        return super.toString() + "\t" + getTransmission() + ", тип кузова: " + getBodyType() + ", номер: " + getRegistrationNumber() + ".";
    }
}
