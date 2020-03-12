package by.airport;

public class Aircraft {
    private  String model; // название
    private int range; // дальность
    private int height; // высота
    private int speed; // скорость

    public Aircraft(String model, int range, int height, int spead) {
        this.model = model;
        this.range = range;
        this.height = height;
        this.speed = spead;
    }

    public String getModel() {
        return model;
    }

    public int getRange() {
        return range;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }
}
