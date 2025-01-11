package java_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_operations 
{


        public static void traverseLIst()
    {
         ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30); 


        // Traversing the list using a for-each loop
        for (int element : list) 
        {
            System.out.print(element+" ");
        }
    }
    public static void Traversing()
    {
        ArrayList<Integer> list = new ArrayList<>(5); // Initial capacity of 5
        list.add(10);
        list.add(20);
        list.add(30);

        // Traversing the list
        for (int element : list) {
            System.out.print(element+" ");
        }
    }
    public static void addingelement()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Adding elements at specific indices
        list.add(1, 15); // Insert 15 at index 1
        list.add(0, 5); // Insert 5 at the beginning

        // Traversing the list
        for (int element : list) {
            System.out.print(element+" ");
        }
    }
    public static void Get_element()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int elementAtIndex1 = list.get(1);
        System.out.print("Element at index 1: " + elementAtIndex1);
    }
    public static void  Remove_element()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1); 
 // Remove the element at index 1
        list.remove(0); // Remove the first element
        list.remove(Integer.valueOf(20)); // Remove the element 20

        // Traversing the list
        for (int element : list) {
            System.out.print(element+" ");
        }
    }
    public static void Check_element()
    {
        //public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
    
            boolean contains20 = list.contains(20);
            System.out.println("List contains 20: " + contains20);
    }
    public static void Get_index()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int indexOf20 = list.indexOf(20);
        System.out.println("Index of 20: " + indexOf20);
    }
    public static void Clear_method()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.clear();

        System.out.println("List size after clearing: " + list.size());
    }
    public static void Iterating_method()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Iterating using a for-each loop
        for (int element : list) 
        {
            System.out.print(element+" ");
        }
    }
    public static void Sorted_method()
    {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list);

        // Traversing the sorted list
        for (int element : list) {
            System.out.print(element+" ");
        }
        
    }
    public static void Reverse_method()
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Collections.reverse(list); 


        // Traversing the reversed list
        for (int element : list) {
            System.out.print(element+" ");
        }
    }
    public static void List_to_array()
    {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
    public static void Traverse_sublist()
    {
         ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40); 

        list.add(50);

        List<Integer> sublist = list.subList(1, 4); // Sublist from index 1 to 3 (exclusive)

        // Traversing the sublist
        for (int element : sublist) 
        {
            System.out.print(element+" ");
        }
    }




    public static void main(String[] args) 
    {
        addingelement();//5 10 15 20 30
        traverseLIst();//10 20 30
        Traversing();//10 20 30
        Get_element();//20
        Remove_element();//30
        Check_element();//true
        Get_index();//1
        Clear_method();//0
        Iterating_method();//10 20 30
        Sorted_method();//10 20 30
        Reverse_method();//30 20 10
        List_to_array();//[10, 20, 30]
        System.out.println();
        Traverse_sublist();//20 30 40
    }


    
    
}
