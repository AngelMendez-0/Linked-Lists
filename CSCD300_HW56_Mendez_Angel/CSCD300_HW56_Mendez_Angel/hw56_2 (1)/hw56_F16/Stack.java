public class Stack<E> {
    private Object[] elements;
    private int top;

    public Stack(int size) {
        elements = new Object[size];
        top = -1;
    } // end of stack

    public void push(E item) {
        elements[++top] = item;
    } // end of push

    public E pop() {
        return (E) elements[top--];
    } // end of pop

    public E peek() {
        return (E) elements[top];
    } // end of peek

    public boolean isEmpty() {
        return (top == -1);
    } // end of isEmpty

} // end of Stack
