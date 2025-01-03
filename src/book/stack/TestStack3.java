package book.stack;

public class TestStack3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        Stack s = new Stack(8);

        mystack = ds;
        for (int i = 0; i < 10; i++) {
            mystack.push(i);
        }
        mystack = s;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }
        mystack = ds;
        System.out.println("Знaчeния в стеке с динамическим размером: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack.pop());
        }
        mystack = s;
        System.out.println("Значения в стеке с фиксированным размером: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }
    }
}
