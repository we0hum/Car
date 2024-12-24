package test_rectangle;

public class triangle {
    public static void main(String[] args) {
        String sO = "*";
        for (int i = 0; i < 6 ; i++) {
            if (i == 0) {
                for (int j = 0; j < 8 ; j++) {
                    System.out.print(sO);
                }
                System.out.println();
            }
            else if (i == 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(sO);
            }
            else if (i == 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(sO);
            }
            else if (i == 3) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" ");
                }
                System.out.println(sO);
            }
            else if (i == 4) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(" ");
                }
                System.out.println(sO);
            }
            else if (i == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.println(sO);
            }
            else {
                System.out.print(" ");
                for (int j = 1; j < 8 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(sO);
            }
        }
    }
}















//public class test_rectangle.triangle {
//    public static void test_rectangle.main(String[]args) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 8; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(j == i || j == 0 || i == 8 - 1 ? "*" : " ");
//            }
//            System.out.println();
//        }
//
//    }
//}





//public class test_rectangle.triangle {
//    public static void test_rectangle.main(String[] args) {
//        for(int i = 8; i > 0; i--) {
//            for (int j = 8 - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            if (i == 1 || i == 8) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//            }
//            else {
//                for(int j = 1; j <= i; j++) {
//                    if(j == 1 || j == i) {
//                        System.out.print("*");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}