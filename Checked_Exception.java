import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import  java.net.*;

public class Checked_Exception 
{


    public  static   void   filehandling_exception()
    {
        try {
          
            FileReader file = new FileReader("nonexistentFile.txt");
            BufferedReader fileInput = new BufferedReader(file);
            fileInput.readLine();
            fileInput.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Checked Exception caught: " );
        }
    }
    


    public  static  void   ClassNot_Found_Exception()
    {

        try 
        {
            // Attempt to load a class that doesn't exist
            Class.forName("nonexistentClass");
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("Checked Exception caught: " );
        }
    }






    public  static  void IOException_handling()
    {
        try 
        {

            // Attempt to read a file that doesn't exist
            FileReader file = new FileReader("nonexistentFile.txt");
            BufferedReader fileInput = new BufferedReader(file);
            fileInput.readLine();
            fileInput.close();
        } 
        catch (IOException e) 
        {
            System.out.println("IOException caught: " );
        }

    }


    public  static  void  sql_exception()
    {

         try 
         {
            // Attempt to connect to a database with invalid credentials
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "wrongpassword");
        } 
        catch (SQLException e) 
        {
            System.out.println("SQLException caught: " );
        }

    }


    public  static  void file_notfound()
    {
         try
          {
            // Attempt to open a file that doesn't exist
            FileReader file = new FileReader("nonexistentFile.txt");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("FileNotFoundException caught: " );
        }
    }
    public  static  void  interepted_exception()
    {

        try 
        {
            // Simulating a thread sleep and interruption
            Thread.sleep(2000);
            Thread.currentThread().interrupt(); // Interrupt the thread
            Thread.sleep(1000); // This will throw InterruptedException
        } 
        catch (InterruptedException e) 
        {
            System.out.println("InterruptedException caught: ");
        }

    }

    public  static  void nosuch_method_exception()
    {


        try 
        {
            // Attempt to get a non-existing method
            Method method = Class.forName("java.lang.String").getMethod("nonExistentMethod");
        } 
        catch (NoSuchMethodException e) 
        {
            System.out.println("NoSuchMethodException caught: " );
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("ClassNotFoundException caught: " );
        }
    }


    public  static  void  parse_exception()
    {
        try 
        {
            // Attempt to parse an invalid date string
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.parse("2025-13-4870"); // Invalid date
        } 
        catch (ParseException e) 
        {
            System.out.println("ParseException caught: ");
        }

    }


    public  static   void Time_out_Exception()
    {
         try 
         {
            // Simulating a timeout exception
            ExecutorService executor = Executors.newFixedThreadPool(1);
            Callable<String> task = () -> 
            {
                Thread.sleep(5000);
                return "Task Completed";
            };
            executor.invokeAny(Arrays.asList(task), 1, TimeUnit.SECONDS); // Timeout of 1 second
        } 
        catch (TimeoutException e) 
        {
            System.out.println("TimeoutException caught: " + e);
        } 
        catch (InterruptedException | ExecutionException e) 
        {
            System.out.println("Exception caught: " + e);
        }
    }

    public  static  void  malformed_URL_Exception()
    {


        try 
        {
            // Attempt to create a malformed URL
            URL url = new URL("htp://incorrect-url.com");
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException caught: " );
        }
    }

    public  static void unknownHost_Exception()
    {

        try 
        {
            // Attempt to get the IP address of an unknown host
            InetAddress.getByName("nonexistenthost.com");
        } 
        catch (UnknownHostException e) {
            System.out.println("UnknownHostException caught: " + e);
        }

    }
    public static void main(String[] args) 
    {
        filehandling_exception();//Checked Exception caught:
        ClassNot_Found_Exception();//Checked Exception caught:
        IOException_handling();//IOException caught:
        sql_exception();//SQLException caught: 
        file_notfound();//FileNotFoundException caught
        interepted_exception();//InterruptedException caught:
        nosuch_method_exception();//NoSuchMethodException caught:
        parse_exception();//ParseException caught
        Time_out_Exception();//TimeoutException caught: java.util.concurrent.TimeoutException
        malformed_URL_Exception();//MalformedURLException caught:
        unknownHost_Exception();//UnknownHostException caught: java.net.UnknownHostException: No such host is known (nonexistenthost.com
    }
    
}
