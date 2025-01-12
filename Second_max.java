package Inheritance;

public class Second_max 
{

    public   static   void  secondmax()
    {
        int arr[]={10,20,30,40,50,60,70,1,2,3,4,5,5,6778,876};
        int max1=arr[0];
        int max2=arr[0];

        if(arr[0]>arr[1])
        {
            max1=arr[0];
            max2=arr[1];
        }
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else
            {
                max2=arr[i];
            }
        }
        System.out.println("  max2:"+max2);
    }

    public    static  boolean  sortedornot()
    {
        int arr[]={10,20,30,40};
      for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) 
    {
        secondmax();//876
        System.out.println(sortedornot());//true
        
    }
    
}
