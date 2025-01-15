package сar_lesson;

public class Main {
    public static void main(String[] args) {
        Bmw bmw1 = new Bmw();
        bmw1.allInfo();

        MercedesBenz merc = new MercedesBenz(100, "b413", 4, "akpp", 500, "yellow", "cls63");
        merc.allInfo();
    }
}
