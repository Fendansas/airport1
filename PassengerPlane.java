package by.airport;

public class PassengerPlane extends Aircraft implements Comparable<PassengerPlane> {
    public PassengerPlane(String model, int range, int height, int speed, int literKm) {
        super(model, range, height, speed, literKm);
    }

    private int places;

    public PassengerPlane(String model, int range, int height, int speed, int literKm, int places) {
        super(model, range, height, speed, literKm);
        this.places = places;
    }

    public PassengerPlane() {

    }

    public int getPlaces() {
        return places;
    }



    @Override
    public int compareTo(PassengerPlane o) {
        if (getRange( )< o.getRange())
            return -1;
        else if (getRange() > o.getRange())
            return -1;
        else
            return 0;

    }

    @Override
    public String toString() {
        return ( "range = " + getRange()+ " LiterKm =" + getLiterKm());


        }
    }

