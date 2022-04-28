package aviacompany.aircraft.instances;

import record.CompactDisk;
import sheffpovar.Vegetable;

import java.util.*;

public class AircraftPort {

    private Aircraft[] aircrafts;

    public AircraftPort(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    public void sort() {
        Arrays.sort(aircrafts);
    }

    public int calculateCapacity() {
        int sum = 0;

        for (Aircraft aircraft : aircrafts) {
            sum += aircraft.getCapacity();
        }
        return sum;
    }

    public int countWeight() {
        int sum = 0;

        for (Aircraft aircraft : aircrafts) {
            sum += aircraft.getCountWeight();
        }
        return sum;
    }

    public void printByRange(int from, int to) {
        for (Aircraft aircraft : aircrafts) {
            int fuelConsumption = aircraft.getFuelСonsumption();
            if (fuelConsumption > from && fuelConsumption < to) {
                System.out.println(aircraft);
            }


        }

    }

    public void printAll() {
        System.out.println(Arrays.toString(aircrafts));
    }

    public List<Aircraft> removeDuplicates(List<Aircraft> aircrafts) {

        Set<Aircraft> set = new HashSet<>(aircrafts);

        return new ArrayList<>(set);
    }
}

