public interface ListInterface<T>
{
    void push( T element) throws OverflowException;
    void pop() throws UnderflowException;
    T top() throws UnderflowException;

    //Boolean Methods
    boolean isEmpty();

    //Other Methods
    void makeEmpty();
    boolean isFull();
}
