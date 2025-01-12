package Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Power_of_Any_Number 
{

    public  static  boolean power_of_any(int num)
    {
        int  k=6;
        while (num%k==0) 
        {
            num=num/k;
        }
        return num==1;
        
    }



    public   static  void  missing_Number()
    {
        System.out.println("  missing  number is :");
        int arr[]={0,2,3,5,6,4,8};
        int k=arr[0];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                k=i;
                break;
            }
        }
        System.out.println(k);
    }


    public   static  void   greater_tnext()
    {
        ArrayList<Integer>a=  new ArrayList<>();
        int arr[]={1,2,4,6,9,10,1,4,5,1};
        for(int i=0;i<arr.length;i++)
        {
            if(i+2>=arr.length)
            {
                break;
            }
            if(arr[i]+arr[i+1]>arr[i+2])
            {
             a.add(arr[i+2]);
            }
        }
        System.out.println(a);
    }

    public   static  void  oddeven_differences()
    {
        int arr[]={10,20,11,23};
        int odd=0,even=0;
        for(int num:arr)
        {
            if(num%2==0)
            {
                even=even+num;
            }
            if(num%2!=0)
            {
                odd=odd+num;
            }
        }
        System.out.println(odd-even);
    }
    public   static  void  totalcontains()
    {
        int arr[]={3,42,6,14,60};
        int  total=0;
        for(int num:arr)
        {
            int f=num/12;
            total=total+f;
        }
        System.out.println(total);
    }
    public   static  void  single_number()
    {
        int arr[]={10,20,30,40,50,10,20,30,40};
        int ans=0;
        for(int num:arr)
        {
            ans=ans^num;
        }
        System.out.println(ans);
    }
     public   static  int []  twosum()
    {
        int  arr[]={10,20,30,40};
        int tar=70;
        HashMap<Integer,Integer>hh=  new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff=tar-arr[i];
            if(hh.containsKey(diff))
            {
                return  new  int[]{hh.get(diff),i};
            }
            else
            {

                hh.put(arr[i], i);
            }
        }
        return  new int[]{-1,-1};
    }
    public static void main(String[] args) 
    {
        System.out.println(power_of_any(98));//false
        missing_Number();//1
        greater_tnext();//[9, 10, 1, 4, 1]
        oddeven_differences();//4
        totalcontains();//9
        single_number();//50
        int arr[]= new int[3];
        arr=twosum();
        System.out.println(arr[0]+" "+arr[1]);//2 3

        
    }
    
}
