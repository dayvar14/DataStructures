package exc;

public class StackUnderflowException extends RuntimeException
{
    public StackUnderflowException(String string)
    {
        super(string);
    }
}
