package by.airport;

public class PassengerPlane extends Aircraft implements Comparable<PassengerPlane> {
    public PassengerPlane(String model, int range, int height, int speed) {
        super(model, range, height, speed);
    }
    private int places;

    public PassengerPlane(String model, int range, int height, int speed, int places) {
        super(model, range, height, speed);
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }


    @Override
    public int compareTo(PassengerPlane o) {
        if(o.getPlaces()> o.getPlaces())
            return 1;
        else if(o.getPlaces()== o.getPlaces())
            return -1;
        else
            return 0;

    }
}
