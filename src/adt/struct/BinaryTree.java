public class BinaryTree<T, K> extends List<T>
{
    BTNode<T,K> root = null;
    @Override
    public void push(T data) throws OverflowException
    {
        push(data, null);
    }

    public void push(T data, K key)
    {
        if( root == null)
        {
            BTNode<T,K> BTNode = new BTNode<T,K>(data,key,root);
            root = BTNode;
        }
        else
        {

        }
    }

    public void findBranch()
    {
        boolean finished = false;
        Stack<BTNode<T,K>> stack = new Stack();
        BTNode<T,K> preNode = null, nextNode = null;
        preNode = root;
        while( preNode != null)
        {
            preNode.getBranches();
        }
    }
}
