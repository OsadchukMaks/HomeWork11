package sheffpovar;

public class SaladeMain {
    public static void main(String[] args) {
        Vegetable[] vegetables = new Vegetable[3];

        Carrot carrot1 = new Carrot(12, 10, Color.YELLOW, 40);
        Carrot carrot2 = new Carrot(12, 10, Color.YELLOW, 40);

        carrot1.equals(carrot2);

        vegetables[0] = carrot2;
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
