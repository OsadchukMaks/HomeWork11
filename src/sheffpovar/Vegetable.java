package sheffpovar;

import java.util.Objects;

public abstract class Vegetable implements Comparable<Vegetable> {
    private int calories;
    private int size;
    private Color color;

    public Vegetable(int calories, int size, Color color) {
        this.calories = calories;
        this.size = size;
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public int compareTo(Vegetable v) {
        return Integer.compare(this.calories, v.calories);
    }

    @Override
    public String toString() {
        return
                "{calories=" + calories +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return calories == vegetable.calories && size == vegetable.size && color == vegetable.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, size, color);
    }
}
