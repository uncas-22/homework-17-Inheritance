package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String colorBody;
    private int speedMax;

    public Transport(String brand, String model, int year, String country, String colorBody, int speedMax) {
        setBrand(brand);
        setModel(model);
        if (year > 0) {
            this.year = year;
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }
        setColorBody(colorBody);
        setSpeedMax(speedMax);
    }


    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isBlank() && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "некорректные данные";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "некорректные данные";
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColorBody() {
        return colorBody;
    }

    public void setColorBody(String colorBody) {
        if (colorBody != null && !colorBody.isBlank() && !colorBody.isEmpty()) {
            this.colorBody = colorBody;
        } else {
            this.colorBody = "белый";
        }
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        if (speedMax > 0) {
            this.speedMax = speedMax;
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", год выпуска: " + getYear() + " г. " + ", произведено в: " + getCountry()
                + ", цвет - " + getColorBody() + ", максимальная скорость: " + getSpeedMax() + " км/ч.";
    }
}
