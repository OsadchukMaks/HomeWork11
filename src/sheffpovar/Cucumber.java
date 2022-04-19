package sheffpovar;

import java.util.Objects;

public class Cucumber extends Vegetable {
    private boolean frostResistance;

    public Cucumber(int calories, int size, Color color, boolean frostResistance) {
        super(calories, size, color);
        this.frostResistance = frostResistance;
    }

    @Override
    public String toString() {
        return "Cucumber " + super.toString().concat(
                "frostResistance=" + frostResistance +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cucumber cucumber = (Cucumber) o;
        return frostResistance == cucumber.frostResistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), frostResistance);
    }
}
