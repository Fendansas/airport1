package by.airport;

public class CargoAirplane extends Aircraft {
    public CargoAirplane(String model, int range, int height, int speed) {
        super(model, range, height, speed);
    }
    private int weight;

    public CargoAirplane(String model, int range, int height, int speed, int weight) {
        super(model, range, height, speed);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
