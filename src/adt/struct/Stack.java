public class Stack<T> implements ListInterface<T>
{
    Node<T> topNode;

    public Stack()
    {

    }

    @Override
    public void push(T data) throws OverflowException
    {
        Node<T> element = new Node<T>(data,topNode);
    }
    @Override
    public T top()
    {
        T element;
        if( topNode == null)
            throw new UnderflowException("Stack is empty");
        else
        {
            Node node = topNode;
            return (T)node.getData();
        }
    }

    @Override
    public void pop() throws UnderflowException
    {
        T element;
        if( topNode == null)
            throw new UnderflowException("Stack is empty");
        else
        {
            topNode = topNode.getNext();
            return;
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

    @Override
    public void makeEmpty()
    {
        topNode = null;
    }


}
