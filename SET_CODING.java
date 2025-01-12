package Inheritance;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SET_CODING 
{

    public   static   void   Simple_hashset()
    {
        System.out.println(" ts  hashset:");
        int arr[]={10,20,30,90,80,65,1,2,3,45,56,};
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
    public   static   void    Linked_hash_set()
    {
        System.out.println("  lhs hashset:");
        int arr[]={10,20,30,90,80,65,1,2,3,45,56};
        LinkedHashSet<Integer>aa=  new LinkedHashSet<>();
        for(int num:arr)
        {
            aa.add(num);
        }
        for(int num:aa)
        {
            System.out.print(num+" ");
        }
    }
    public   static   void    Tree_set()
    {
        System.out.println("  lhs hashset:");
        int arr[]={10,20,30,90,80,65,1,2,3,45,56};
        TreeSet<Integer>aa=  new TreeSet<>();
        for(int num:arr)
        {
            aa.add(num);
        }
        System.out.println("   treeset:");
        for(int num:aa)
        {
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) 
    {
       Simple_hashset();//1 2 3 10 20 30 45 56 65 80 90
       Linked_hash_set();//10 20 30 90 80 65 1 2 3 45 56
       Tree_set();//1 2 3 10 20 30 45 56 65 80 90
        
    }
    
}
