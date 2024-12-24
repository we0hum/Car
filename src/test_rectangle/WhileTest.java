package test_rectangle;

public class WhileTest {
    public static void main(String[] args) {
        int i = 900;
        while (i >= 755) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i --;
        }
    }
}
