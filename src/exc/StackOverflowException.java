package exc;

public class StackOverflowException extends RuntimeException
{
    public StackOverflowException( String string)
    {
        super(string);
    }
}
