package сar_lesson;

public class Main {
    public static void main(String[] args) {
        Bmw bmw1 = new Bmw();
        bmw1.allInfo();

        MercedesBenz merc = new MercedesBenz(4, "akpp", "black", "cls63", new Car.Engine("b453", 123, 400) );
        merc.allInfo();
    }
}
