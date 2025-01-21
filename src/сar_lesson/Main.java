package сar_lesson;

public class Main {
    public static void main(String[] args) {
        Bmw bmw1 = new Bmw();
        bmw1.allInfo();

        MercedesBenz merc = new MercedesBenz(4, "akpp", "black", "cls63", String.valueOf("b453".toCharArray()), 123, 400);
        merc.allInfo();
    }
}
