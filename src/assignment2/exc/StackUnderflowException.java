package assignment2.exc;

public class StackUnderflowException extends RuntimeException
{
    public StackUnderflowException(String string)
    {
        super(string);
    }
}
