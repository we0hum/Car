package book;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        for (int i = 0; i < 10; i++) ob.values[i] = i; {
            ob.printArray(10);
        }
    }
}

class RecTest {
    int[] values;
    RecTest(int i) {
        values = new int [i];
    }
    void printArray(int i) {
        if (i == 0) {
            return;
        }
        else {
            printArray(i - 1);
        }
        System.out.println(" [" + (i - 1) + "] " + values[i - 1]);
    }
}