package by.airport;

import java.util.*;

public class Airline {
    private ArrayList<PassengerPlane> pass;
    private ArrayList<CargoAirplane> carg;


    public Airline(ArrayList<PassengerPlane> pass, ArrayList<CargoAirplane> carg) {
        this.pass = pass;
        this.carg = carg;
    }


    public ArrayList<PassengerPlane> getPass() {
        return pass;
    }

    public void setPass(ArrayList<PassengerPlane> pass) {
        this.pass = pass;
    }

    public ArrayList<CargoAirplane> getCarg() {
        return carg;
    }

    public void setCarg(ArrayList<CargoAirplane> carg) {
        this.carg = carg;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "\n pass=" + pass +


                "\n carg=" + carg +
                '}';
    }
}

