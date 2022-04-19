package sheffpovar;

import java.util.Objects;

public class Carrot extends Vegetable {
    private int countVitaminA;

    public Carrot(int calories, int size, Color color, int countVitaminA) {
        super(calories, size, color);
        this.countVitaminA = countVitaminA;
    }

    @Override
    public String toString() {
        return "Carrot" + super.toString().concat(
                "countVitaminA=" + countVitaminA +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carrot carrot = (Carrot) o;
        return countVitaminA == carrot.countVitaminA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countVitaminA);
    }
}
