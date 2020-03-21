package by.airport;

public class Aircraft  {
    private  String model; // название
    private int range; // дальность
    private int height; // высота
    private int speed; // скорость
    private int literKm; //расход
    private Airline airline;


    public Aircraft(String model, int range, int height, int speed, int literKm) {
        this.model = model;
        this.range = range;
        this.height = height;
        this.speed = speed;
        this.literKm = literKm;
    }

    public Aircraft() {

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
    public int getLiterKm() {
        return literKm;
    }


    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}
