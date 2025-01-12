class MyUncheckedException extends RuntimeException 
{
    public MyUncheckedException(String message) 
    {
        super(message);
    }
}

public class CustomUncheckedExceptionExample 
{
    public static void main(String[] args) 
    {
        throw new MyUncheckedException("This is a custom unchecked exception!");
    }
}
