package test_rectangle;

public class Rectangle {
    public static void main(String[] args) {
        String sO = "*";
        for (int i = 0; i < 6 ; i++) {
            if (i == 0 || i == 5) {
                for (int j = 0; j < 8 ; j++) {
                    System.out.print(sO);
                }
                System.out.println();
            }
            else {
                System.out.print(sO);
                for (int j = 1; j < 8 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(sO);
            }
        }
    }
}

