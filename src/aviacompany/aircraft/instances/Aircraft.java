package aviacompany.aircraft.instances;

// Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
// -Посчитать общую вместимость и грузоподъемность.
// Провести сортировку самолетов компании по дальности полета.
/*Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего*/
public abstract class Aircraft implements Comparable<Aircraft> {

    private final int countWeight;
    private final int capacity;
    private final int flyDuration;
    private final int fuelСonsumption;

    public Aircraft(int countWeight, int fuelConsumption, int flyDuration, int capacity) {
        this.countWeight = countWeight;
        this.capacity = capacity;
        this.flyDuration = flyDuration;
        this.fuelСonsumption = fuelConsumption;

    }

    @Override
    public int compareTo(Aircraft o) {
        return Integer.compare(this.flyDuration, o.flyDuration);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountWeight() {
        return countWeight;
    }

    public int getFuelСonsumption() {return fuelСonsumption; }

    @Override
    public String toString() {
        return "Aircraft{" +
                "countWeight=" + countWeight +
                ", capacity=" + capacity +
                ", flyDuration=" + flyDuration +
                ", fuelСonsumption=" + fuelСonsumption +
                '}';
    }
}
