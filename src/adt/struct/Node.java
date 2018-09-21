public class Node<T> implements NodeInterface<T>
{
    protected Node<T> next;
    protected T data;
    public Node( T data, Node<T> next )
    {
        this.next = next;
        this.data = data;
    }

    @Override
    public Node getNext()
    {
        return next;
    }

    @Override
    public void setNext( Node<T> next )
    {
        this.next = next;
    }

    @Override
    public T getData()
    {
        return data;
    }

    @Override
    public void setData( T data)
    {
        this.data = data;
    }
}
