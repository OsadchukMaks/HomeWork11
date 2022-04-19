package sheffpovar;

import java.util.Objects;

public class Tomatto extends Vegetable {
    private boolean droughtResistant;

    public Tomatto(int calories, int size, Color color, boolean droughtResistant) {
        super(calories, size, color);
        this.droughtResistant = droughtResistant;
    }

    @Override
    public String toString() {
        return "Tomato" + super.toString().concat(
                "droughtResistant =" + droughtResistant +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tomatto tomatto = (Tomatto) o;
        return droughtResistant == tomatto.droughtResistant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), droughtResistant);
    }
}
