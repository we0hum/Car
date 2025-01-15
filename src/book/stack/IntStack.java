package book.stack;

interface IntStack {
    void push(int item);
    int pop();
    default void clear() throws UnsupportedOperationException{

    }
}
