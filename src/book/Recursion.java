package book;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Фaктopиaл 4 равен " + f.fact(4));
        System.out.println("Фaктopиaл 5 равен " + f.fact(5));
    }
}

class Factorial {
    int result;
    int fact (int n) {
        if (n == 1) {
            return 1;
        }
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}
