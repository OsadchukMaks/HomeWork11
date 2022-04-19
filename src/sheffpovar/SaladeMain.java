package sheffpovar;

public class SaladeMain {
    public static void main(String[] args) {
        Vegetable[] vegetables = new Vegetable[3];

        vegetables[0] = new Carrot(12, 10, Color.YELLOW, 40);
        vegetables[1] = new Cucumber(15, 20, Color.GREEN, true);
        vegetables[2] = new Tomatto(18, 25, Color.BLACK, false);

        Salade salade = new Salade(vegetables);

        int count = salade.calculate();

//        System.out.println(count);

//        salade.sort();

        salade.printByRange(13, 17);

//        salade.printAll();
    }

}
