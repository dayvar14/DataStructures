public interface StackInterface<T>
{
    void pop() throws UnderflowException;
    T top() throws UnderflowException;

}
