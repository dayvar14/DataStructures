public class List<T> implements ListInterface<T>
{
    protected Node<T> topNode;
    protected int size = 0;

    @Override
    public void push(T data) throws OverflowException
    {
        Node<T> element = new Node(data,topNode);
        topNode = element;
        size++;
    }
    @Override
    public void pop() throws UnderflowException
    {
        if( size == 0)
            throw new UnderflowException("Stack is full!");
        else
        {
            topNode = topNode.getNext();
        }

    }


    @Override
    public boolean isEmpty()
    {
        return (topNode == null);
    }

    @Override
    public boolean isFull()
    {
        return false;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    @Override
    public void makeEmpty()
    {
        topNode = null;
    }

}
