package by.airport;

public class CargoAirplane extends Aircraft implements Comparable<CargoAirplane> {
    public CargoAirplane(String model, int range, int height, int speed, int literKm) {
        super(model, range, height, speed, literKm);
    }
    private int weight;

    public CargoAirplane(String model, int range, int height, int speed,int literKm, int weight) {
        super(model, range, height, speed, literKm);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public int compareTo(CargoAirplane o) {
        if(o.getWeight()> o.getWeight())
        return 1;
        else if(o.getWeight()== o.getWeight())
            return -1;
        else
            return 0;





    }

    public int getWeight(int size) {
        return getWeight();
    }
}
