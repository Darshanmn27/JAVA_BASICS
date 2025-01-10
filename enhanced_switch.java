import  java.util.*;
public class enhanced_switch 
{

    public   static   void  enhancedswitch()
    {
        int day=1;
        switch(day)
        {
            case 1-> System.out.println("sunday");
            case 2-> System.out.println("monday");
            case 3-> System.out.println("tuesday");
            case 4-> System.out.println("wednesday");
            case 5-> System.out.println("thursday");
            case 6-> System.out.println("friday");
            case 7-> System.out.println("saturday");
            default-> System.out.println("invalid day");

        }
     
    }

    public  static void intger()
    {
        System.out.println("\ndefault integer  values \n ");
        int arr[]= new int[10];
        System.out.println(arr.length);//10
        for(int i=0;i<=arr.length-1;i++)//0 0 0 0 0 0 0 0 0 0 
        {
           
            System.out.print(arr[i]+" ");
            }


    }
    public  static  void strings()
    {
        System.out.println("\ndefault String  values \n ");
        String arr[]= new String[10];
        System.out.println(arr.length);//10
        for(int i=0;i<=arr.length-1;i++)//null null null null null null null null null null
        {
            System.out.print(arr[i]+" ");
            
    }

    }
    public  static  void chars()
    {
        System.out.println("\ndefault character  values \n ");
        int  arr[]= new int[10];
        System.out.println(arr.length);//10
        for(int i=0;i<=arr.length-1;i++)//null null null null null null null null null null
        {
         System.out.print(arr[i]+" ");
            }

    }
    public  static  void floats()
    {
        System.out.println("\ndefault floats  values \n ");
        Float arr[]= new Float[10];
        System.out.println(arr.length);//10
        for(int i=0;i<=arr.length-1;i++)//null null null null null null null null null null
        {
            System.out.print(arr[i]+" ");

        }

    }



    public static void main(String[] args) 
    {
        enhancedswitch();
        intger();
        strings();
        chars();
        floats();
        
    }
    
}
