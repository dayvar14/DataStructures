public class BTNode<T, K> extends Node<T>
{
    BTNode<T,K> lNode = null;
    BTNode<T,K> rNode = null;
    int index = 0;
    K key = null;

    public BTNode(T data, K key, BTNode<T,K> next )
    {
        super(data,next);

        if (next!=null)
            index = next.getIndex()+1;

    }

    public List<BTNode<T,K>> getBranches()
    {
        List<BTNode<T,K>> children = new List<>();
        children.push(lNode);
        children.push(rNode);
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
