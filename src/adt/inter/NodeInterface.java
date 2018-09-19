public interface NodeInterface<T>
{
    Node<T> getNext();
    void setNext( Node<T> next);
    T getData();
    void setData( T data);
}
