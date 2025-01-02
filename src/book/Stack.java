package book;

public class Stack implements IntStack{
    private int[] stck;
    private int tos;
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек полон.");
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк опустошен.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
