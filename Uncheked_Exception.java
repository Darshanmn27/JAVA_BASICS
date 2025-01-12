import  java.util.*;

public class Uncheked_Exception 
{



    public   static  void Nll_pointer_Exception()
    {
        String str = null;
        try 
        {
            // Attempt to call a method on a null object
            System.out.println(str.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Unchecked Exception caught: " );
        }

    }

    public static  void Array_Index_out_Bound()
    {
        int[] arr = {1, 2, 3};
        try 
        {
            // Attempt to access an index out of bounds
            System.out.println(arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Unchecked Exception caught: ");
        }

    }


    public  static  void Number_format_exception()
    {
        try 
        {
            // Attempt to convert an invalid string to an integer
            int num = Integer.parseInt("abc");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Unchecked Exception caught: ");
        }

    }


    public  static  void arithmetic_exception()
    {
        try 
        {
            // Attempt to divide by zero
            int result = 10 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Unchecked Exception caught: ");
        }
    
    }


    public  static  void cass_cast_exception()
    {
        try 
        {
            Object obj = new String("Hello");
            // Attempting to cast a String object to an Integer
            Integer num = (Integer) obj;  // ClassCastException
        } 
        catch (ClassCastException e) {
            System.out.println("ClassCastException caught: ");
        }
    }


    public  static  void Illegal_argument_exception()
    {

        try
         {
            // Trying to parse an invalid integer string
            int num = Integer.parseInt("abc");  // IllegalArgumentException
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " );
        }

    }


    public  static  void illegalstart_exception()
    {

        try 
        {
            Thread thread = new Thread();
            // Trying to start a thread twice, which is an illegal state
            thread.start();
            thread.start();  // IllegalStateException
        } 
        catch (IllegalStateException e) {
            System.out.println("IllegalStateException caught: ");
        }

    }


    public  static  void No_such_element()
    {

        try
         {
            Iterator<String> iterator = new ArrayList<String>().iterator();
            // Trying to call next() on an empty iterator
            iterator.next();  // NoSuchElementException
        } 
        catch (NoSuchElementException e) 
        {
            System.out.println("NoSuchElementException caught: " );//NoSuchElementException caught: 
        }

    }
    public static void main(String[] args) 
    {
        Nll_pointer_Exception();//Unchecked Exception caught:
        Array_Index_out_Bound();//Unchecked Exception caught:
        Number_format_exception();//Unchecked Exception caught:
        arithmetic_exception();//Unchecked Exception caught:
        cass_cast_exception();//ClassCastException caught:
        Illegal_argument_exception();//IllegalArgumentException caught:
       // illegalstart_exception();
       No_such_element();
    
       
        
    }
    
}
