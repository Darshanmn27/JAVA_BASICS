package java_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import  java.util.Iterator;

public class Tree_Set_Operations 
{


     public static void Read_Write_Elements()
    {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);

    }
    public static void Checking_Element()
    {
        TreeSet<Integer> numbers = new TreeSet<>(); 
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        boolean contains20 = numbers.contains(20);
        System.out.println("Does the set contain 20? " + contains20);
    }
    public static void Remove_Element()
    {
        TreeSet<Character> vowels = new TreeSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.remove('e');
        System.out.println(vowels);

    }
    public static void Iterator_Method()
    {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
    public static void Get_Size()
    {
        TreeSet<Double> decimals = new TreeSet<>();
        decimals.add(3.14);
        decimals.add(2.718);
        decimals.add(1.618);

        int size = decimals.size();
        System.out.println("Size of the set: " + size);
    }
    public static void Check_Element()
    {
        TreeSet<Boolean> booleans = new TreeSet<>();
        boolean isEmpty = booleans.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);
    }
    public static void Clear_Method()
    {
        TreeSet<Long> numbers = new TreeSet<>();
        numbers.add(123456789L);
        numbers.add(987654321L);
        numbers.add(567890123L);

        numbers.clear();
        System.out.println(numbers);
    }
    public static void Arrays_to_Arraylist()
    {
         String[] colors = {"red", "green", "blue", "yellow"};
        TreeSet<String> colorSet = new TreeSet<>(Arrays.asList(colors));
        System.out.println(colorSet);
    }
    public static void Numbers()
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        TreeSet<Integer> numberSet = new TreeSet<>(numbers);
        System.out.println(numberSet);
    }
    public static void Read_character()
    {
        TreeSet<Character> vowels = new TreeSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        TreeSet<Character> consonants = new TreeSet<>();
        consonants.add('b');
        consonants.add('c');
        consonants.add('d');
        consonants.add('f');

        TreeSet<Character> union = new TreeSet<>(vowels);
        union.addAll(consonants);
        System.out.println(union);
    }
    public static void Treeset_Intersection()
    {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        TreeSet<String> colors = new TreeSet<>();
        colors.add("orange");
        colors.add("yellow");
        colors.add("blue");

        TreeSet<String> intersection = new TreeSet<>(fruits);
        intersection.retainAll(colors);
        System.out.println(intersection);
        
    }
    public static void Remove_All()
    {
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);

        TreeSet<Integer> difference = new TreeSet<>(numbers1);
        difference.removeAll(numbers2);
        System.out.println(difference);
    }
    private static void Symmertric_Difference()
    {
        TreeSet<Character> vowels = new TreeSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        TreeSet<Character> consonants = new TreeSet<>();
        consonants.add('b');
        consonants.add('c');
        consonants.add('d');
        consonants.add('f');
        consonants.add('i');

        TreeSet<Character> symmetricDifference = new TreeSet<>(vowels);
        symmetricDifference.removeAll(consonants);
        symmetricDifference.addAll(consonants);
        System.out.println(symmetricDifference);
    }
    public static void Subset_array()
    {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        TreeSet<String> subset = new TreeSet<>();
        subset.add("apple");
        subset.add("banana");

        boolean isSubset = fruits.containsAll(subset);
        System.out.println("Is subset a subset of fruits? " + isSubset);
    }
    public static void Super_Set()
    {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        TreeSet<Integer> superset = new TreeSet<>();
        superset.add(10);
        superset.add(20);
        superset.add(30);
        System.out.println(superset);
    }




    public static void main(String[] args) 
    {
        Read_Write_Elements();
        Checking_Element();
        Remove_Element();
        Iterator_Method();
        Get_Size();
        Check_Element();
        Clear_Method();
        Arrays_to_Arraylist();
        Numbers();
        Read_character();
        Treeset_Intersection();
        Remove_All();
        Symmertric_Difference();
        Subset_array();
        Super_Set();
        
    }

    
}
