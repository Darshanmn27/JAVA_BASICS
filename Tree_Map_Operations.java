package java_coding;

import java.util.Comparator;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import  java.util.*;

public class Tree_Map_Operations 
{



     public static void Adding_Key_Value()
    {

        TreeMap<String, Integer> population = new TreeMap<>();
        population.put("India", 1428627000);
        population.put("China", 1439323776);
        population.put("United States", 338285773);
        population.put("Indonesia", 277373302);
        population.put("Brazil", 215303374);

        System.out.println(population);

    }
    public static void GetMEthod()
    {
        TreeMap<String, Double> prices = new TreeMap<>();
        prices.put("apple", 1.99);
        prices.put("banana", 0.79);
        prices.put("orange", 1.29);

        Double priceOfBanana = prices.get("banana");
        System.out.println("Price of banana: " + priceOfBanana);
    }
    public static void Contains_Method()
    {
        TreeMap<Character, Integer> frequencies = new TreeMap<>();
        frequencies.put('a', 10);
        frequencies.put('b', 8);
        frequencies.put('c', 12);

        boolean containsKeyC = frequencies.containsKey('c');
        System.out.println("Does the map contain key 'c'? " + containsKeyC);

    }
    public static void Remove_Method()
    {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        students.remove(2);
        System.out.println(students);
    }
   
    public static void Min_Max()
    {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        Integer highestKey = students.lastKey();
        Integer lowestKey = students.firstKey();

        System.out.println("Highest key: " + highestKey);
        System.out.println("Lowest key: " + lowestKey);
    }
    public static void Ceiling_Flooring()
    {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        Integer floorKey = students.floorKey(2);
        Integer ceilingKey = students.ceilingKey(2);

        System.out.println("Floor key of 2: " + floorKey);
        System.out.println("Ceiling key of 2: " + ceilingKey);
    }
    
    public static void Sorted_Map()
    {
         HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie",28);

        TreeMap<String, Integer> sortedAges = new TreeMap<>(ages);
        System.out.println(sortedAges);
    }
    public static void Map__Method()
    {
        TreeMap<String, Integer> originalMap = new TreeMap<>();
        originalMap.put("apple", 10);
        originalMap.put("banana", 20);
        originalMap.put("orange", 30);

        SortedMap<String, Integer> subMap = originalMap.tailMap("banana");
        TreeMap<String, Integer> newMap = new TreeMap<>(subMap);
        System.out.println(newMap);
    }
    public static void Check_is_Empty()
    {
        TreeMap<Integer, String> students = new TreeMap<>();
        boolean isEmpty = students.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);
    }
    public static void Check_clear()
    {
        TreeMap<String, Double> prices = new TreeMap<>();
        prices.put("apple", 1.99);
        prices.put("banana", 0.79);
        prices.put("orange", 1.29);

        prices.clear();
        System.out.println(prices);
    }
    public static void Descending_order()
    {
        Comparator<String> descendingOrder = (s1, s2) -> s2.compareTo(s1);
        TreeMap<String, Integer> scores = new TreeMap<>(descendingOrder);
        scores.put("Math", 95);
        scores.put("Science", 88);
        scores.put("English", 92);

        System.out.println(scores);
    }


    public static void main(String[] args) 
    {

        Adding_Key_Value();
        GetMEthod();
        Contains_Method();
        Remove_Method();
        Min_Max();
        Ceiling_Flooring();
        Sorted_Map();
        Map__Method();
        Check_is_Empty();
        Check_clear();
        Descending_order();
        
    }
    
}
