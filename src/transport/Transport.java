package transport;

import java.util.ArrayList;

public abstract class Transport {

    private final String brand;
    private final String model;

    private double engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        this.drivers = drivers;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.6;
        } else {
        this.engineVolume = engineVolume;
    }
        public void addDriver (Driver<> drivers);
        drivers.add(driver);

}
