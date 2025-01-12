package Inheritance;

import java.util.ArrayList;
import java.util.TreeSet;

public class Nth_larget_Number 
{


     public  static  void nthlargest()
    {
        System.out.println("  nth  largest  element  array  :");
        TreeSet<Integer>aa=  new TreeSet<>();
        int arr[]={10,20,30,40,10,20,304,-90,-8,90};
        for(int num:arr)
        {
            aa.add(num);
        }
        int k=3;
        //System.out.println(aa);
        ArrayList<Integer>a= new ArrayList<>(aa);
        System.out.println(a.get(k));//20
    }



    public   static   void    ts()
    {
        System.out.println(" ts  hashset:");
        int arr[]={10,20,30,90,80,65,1,2,3,45,56};
        TreeSet<Integer>aa=  new TreeSet();
        for(int num:arr)
        {
            aa.add(num);
        }
        for(int num:aa)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) 
    {
        nthlargest();//20
        ts();//1 2 3 10 20 30 45 56 65 80 90
        
    }
    
}
