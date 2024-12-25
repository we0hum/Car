package сar_lesson;

public class Test {
    public static void main(String[] args) {
        Bmw bmw1 = new Bmw(20, "b43",  4, "АКПП", 300, "желтый", "M5");
        bmw1.allInfo();

        System.out.println();

        MercedesBenz merc = new MercedesBenz(50, "b43685",  5, "АКПП", 200, "черный", "cls63");
        merc.allInfo();
    }
}
