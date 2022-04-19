package sheffpovar;

import java.util.*;

public class Salade implements Calculatable, Sortable, Printable {
   private Vegetable[] vegetables;

    public Salade(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public int calculate() {
        int sum = 0;

        for (Vegetable vegetable : vegetables) {
            sum  += vegetable.getCalories();
        }

        return sum;
    }

    @Override
    public void sort() {
        Arrays.sort(vegetables);
    }

    @Override
    public void printByRange(int from, int to) {
        for (Vegetable vegetable : vegetables) {
            int calories = vegetable.getCalories();
            if (calories > from && calories < to) {
                System.out.println(vegetable);
            }
        }
    }

    @Override
    public void printAll() {
        System.out.println(Arrays.toString(vegetables));
    }

    public List<Vegetable> removeDuplicates(List<Vegetable> vegetables) {

        Set<Vegetable> set = new HashSet<>(vegetables);

        return new ArrayList<>(set);
    }
}
