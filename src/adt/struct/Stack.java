public class Stack<T> extends List<T> implements StackInterface<T>
{

    @Override
    public T top()
    {
        T element;
        if( topNode == null )
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
        if( topNode == null)
            throw new UnderflowException("Stack is empty");
        else
        {
            topNode = topNode.getNext();
            size--;
            return;
        }
    }



}
