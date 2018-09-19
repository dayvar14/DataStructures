package assignment2;

import assignment2.adt.CS304ArrayBoundedStack;
import assignment2.exc.StackOverflowException;
import assignment2.exc.StackUnderflowException;

public class Ayvar091918ArrayBoundedStack extends CS304ArrayBoundedStack
{
    private final static int DEFAULT_SIZE = 100;

    public Ayvar091918ArrayBoundedStack()
    {
        ditArray = new DanielItemType[DEFAULT_SIZE];
        topIndex = -1;
    }

    public Ayvar091918ArrayBoundedStack(int maxSize)
    {
        this.maxSize = maxSize;
        ditArray = new DanielItemType[maxSize];
        topIndex = -1;
    }

    @Override
    public void pop()
    {
        if( topIndex == -1)
        {
            throw new StackUnderflowException("Ayvar091918ArrayBoundedStack is empty.");
        }
        else
        {
            ditArray[topIndex] = null;
            topIndex--;
        }
    }

    @Override
    public void push( DanielItemType dit)
    {
        if( topIndex == maxSize -1)
        {
            throw new StackOverflowException("Ayvar091918ArrayBoundedStack is full.");
        }
        else
        {
            topIndex++;
            ditArray[topIndex] = dit;
        }
    }

    @Override
    public DanielItemType top()
    {
        DanielItemType dit;

        if( topIndex == -1)
        {
            throw new StackUnderflowException("Ayvar091918ArrayBoundedStack is empty.");
        }
        else
        {
            dit = ditArray[topIndex];
        }

        return dit;
    }

    @Override
    public boolean isEmpty()
    {
        boolean empty = false;
        if(topIndex == -1)
            empty = true;
        return empty;
    }

    @Override
    public boolean isFull()
    {
        boolean full = false;
        if(topIndex == maxSize-1)
            full = true;
        return full;
    }

    @Override
    public void makeEmpty()
    {
        topIndex = -1;
    }

}
