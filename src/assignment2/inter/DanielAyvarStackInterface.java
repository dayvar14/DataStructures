package assignment2.inter;

import assignment2.DanielItemType;
import assignment2.exc.StackOverflowException;
import assignment2.exc.StackUnderflowException;

public interface DanielAyvarStackInterface
{
    //Basic Ayvar091918ArrayBoundedStack Methods
    void push( DanielItemType dit) throws StackOverflowException;
    void pop() throws StackUnderflowException;
    DanielItemType top() throws StackUnderflowException;

    //Boolean Methods
    boolean isEmpty();

    //Other Methods
    void makeEmpty();
    boolean isFull();

}
