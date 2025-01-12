package Inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MAP_CODING 
{

    public  static  void  Hash_map()
    {
        System.out.println("make youe  own :  hashmap:");
        int arr[]={10,20,30,40,1,2,3,0,9,100,200};
        HashMap<Integer,Integer>aa=  new HashMap<>();
        for(int num:arr)
        {
            aa.put(num, aa.getOrDefault(num,0)+1);
        }
        System.out.println(aa);
    }
    public  static  void  simple_tree_map()
    {
        System.out.println("  tree hashmap:");
        int arr[]={10,20,30,40,1,2,3};
        TreeMap<Integer,Integer>aa=  new TreeMap();
        for(int num:arr)
        {
            aa.put(num, aa.getOrDefault(num,0)+1);
        }
        System.out.println(aa);
    }

    public  static  void  Linked_has_map()
    {
        System.out.println("  tree hashmap:");
        int arr[]={10,20,30,40,1,2,3};
        LinkedHashMap<Integer,Integer>aa=  new LinkedHashMap<>();
        for(int num:arr)
        {
            aa.put(num, aa.getOrDefault(num,0)+1);
        }
        System.out.println(aa);
    }

    public   static void pascal()
    {
        List<List<Integer>>aa=  new ArrayList<>();
        int num=4;
        for(int i=0;i<num;i++)
        {
            ArrayList<Integer>a= new ArrayList<>();
            int k=(int)Math.pow(11, i);
            a.add(k);
            aa.add(a);
        }
        System.out.println(aa);
        // for(List a:aa)
        // {
        //     System.out.print(a+" ");
        // }
    }


    public    static   void  mostfrequence_characters()
    {
        String input = "success";
        HashMap<Character,Integer> hh=  new HashMap<>();
        for(char ch:input.toCharArray())
        {
            hh.put(ch, hh.getOrDefault(ch,0)+1);
        }  
        int max=0;
        for(int f:hh.values())
        {
            max=Math.max(max, f);
        }
        for(Map.Entry<Character,Integer>entry:hh.entrySet())
        {
            if(entry.getValue()==max)
            {
                System.out.println(entry.getKey());
            }
        }

    }
    public   static  void  firstnonrepeated_character()
    {
        String s="swiss";
        LinkedHashMap<Character,Integer> lh=  new LinkedHashMap<>();
        char arr[]=s.toCharArray();
        for(char ch:arr)
        {
            lh.put(ch, lh.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>e:lh.entrySet())
        {
            if(e.getValue()==1)
            {
                System.out.println(e.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) 
    {
        Hash_map();//{0=1, 1=1, 2=1, 3=1, 20=1, 100=1, 40=1, 200=1, 9=1, 10=1, 30=1}
        simple_tree_map();//{1=1, 2=1, 3=1, 10=1, 20=1, 30=1, 40=1}
        Linked_has_map();//{10=1, 20=1, 30=1, 40=1, 1=1, 2=1, 3=1}
        pascal();//[[1], [11], [121], [1331]]
        mostfrequence_characters();//s
        firstnonrepeated_character();//w
        
    }
    
}
