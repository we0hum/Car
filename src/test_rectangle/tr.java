package test_rectangle;

public class tr {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++){
            if (i == 0 || i == 6 - 1) {
                for (int j = 0; j < 8; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                System.out.print("*");
                for (int j = 1; j < 8 - 1; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}



