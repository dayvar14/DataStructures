public class BTNode<T, K> extends Node<T>
{
    BTNode lNode = null;
    BTNode rNode = null;
    int index = 0;
    K key = null;

    public BTNode(T data, BTNode next )
    {
        super(data,next);

        if (next!=null)
            index = next.getIndex()+1;

    }

    public BTNode[] getChildren()
    {
        BTNode[] children = {lNode, rNode};
        return children;
    }

    public Boolean isLeaf()
    {
        return( lNode == null && rNode == null);
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }
}
