public interface ListInterface<T>
{

    //Boolean Methods
    boolean isEmpty();

    //Other Methods
    void makeEmpty();
    boolean isFull();

    void push( T element) throws OverflowException;
    void pop() throws UnderflowException;
}
