package book;

public class TwoDArray {
    public static void main(String[] args) {
        var twoD = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] = k);
                System.out.print(" ");
                k++;
            }
        }
    }
}


// это пример из учебника
//public static void main(String[] args) {
//    int[][] twoD = new int[4][5];
//    int i, j, k = 0;
//    for (i = 0; i < 4; i++)
//        for (j = 0; j < 5; j++) {
//            twoD[i][j] = k;
//            k++;
//        }
//    for (i = 0; i < 4; i++) {
//        for (j = 0; j < 5; j++)
//            System.out.print(twoD[i][j] + " ");
//        System.out.println();
//    }
//}


