import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashset_coding_programs 
{
    public static boolean checkduplicates()
    {
        System.out.println("  check  duplicates");
        int arr[]={10,20,30,10,40};
        HashSet<Integer> kk= new HashSet<>();
        for(int num:arr)
        {
            if(!kk.add(num))
            {
                return true;
            }
        }
        return false;

    }

    public static void removeduplicates()
    {
        System.out.println("remove  duplicates:");
        int arr[]={102,90,87,65,10,19,28,16,10,10};
        HashSet<Integer>kk= new HashSet<>();
        for(int num:arr)
        {
            kk.add(num);
        }
        for(int n:kk)
        {
            System.out.print(n+" ");
        }
    }

    public static void unionoftwoarr()
    {
        System.out.println(" \n union of  two  array: ");
        int arr1[]={10,20,38,54,89,23};
        int arr2[]={10,20,30,1,2,3,4,5};
        HashSet<Integer> p=  new HashSet<>();
        HashSet<Integer> in=  new HashSet<>();
        HashSet<Integer> inp=  new HashSet<>();
        for(int num:arr1)
        {
            p.add(num);
        } 
        for(int num:arr2)
        {
            if(p.contains(num))
            {
                in.add(num);
            }
            if(!p.contains(num))
            {
                inp.add(num);

            }
            p.add(num);
        }
        for(int n:p)
        {
            System.out.print(n+" ");
        } 
        System.out.println("\n intersection:"+in);//[20, 10]
        System.out.println("\n other intersection:"+inp);//[1, 2, 3, 4, 5, 30]
    }

    public static void  unique()
    {
        int arr[]={10,29,37,45,10,29,10,20,30,40};
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int num:arr)
        {
            if(hm.containsKey(num))
            {
                hm.put(num, hm.get(num)+1);
            }
            else
            {
                hm.put(num, 1);
            }
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.print(e.getKey()+" ");
            }
        }
    }
        


    public static void  uniquecharacter()
    {
        System.out.println("unique  character:");
        String ss="darshan";
        HashSet<Character> kk=  new HashSet<>();
        for(char ch:ss.toCharArray())
        {
            kk.add(ch);
        }
        System.out.println(kk);
    }

    public static void anagram()
    {
        String ss1="anagram";
        String ss2="nagaramd";
        char ch1[]=ss1.toCharArray();
        char ch2[]=ss2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2))
        {
            System.out.println("  strings  are  anagram");
        }
        else
        {
            System.out.println("  not  anagram");
        }
    }

    public static void panagram()
    {
        String ss="qwertyuiplkjhgfdaszmnxbxvc";
        HashSet<Character> kk= new HashSet<>();
        for(char ch1:ss.toCharArray())
        {
            kk.add(ch1);
        }
        if(kk.size()==26)
        {
            System.out.println("  panagram");
        }
        else
        {
            System.out.println("  not  panagram");
        }
    }
    public static char firstnonrepeating()
    {
        String ss="arshan";
        HashMap<Character,Integer> kk=  new HashMap<>();
        for(char cc:ss.toCharArray())
        {
            kk.put(cc, kk.getOrDefault(cc, 0)+1);
        }
        for(char ch:ss.toCharArray())
        {
            if(kk.get(ch)==1)
            {
                return ch;
            }
        }
        return ' ';
    }

    public static boolean checksubset()
    {
        int arr1[]={10,20,30,40};
        int arr2[]={10,30};
        HashSet<Integer> ss=  new HashSet<>();
        for(int num:arr1)
        {
            ss.add(num);
        }
        for(int kk:arr2)
        {
            if(!ss.contains(kk))
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) 
    {
        System.out.println(checkduplicates());//true
        removeduplicates();//16 65 19 102 87 90 10 28
        unionoftwoarr();
        unique();//10 29
        uniquecharacter();//[a, r, s, d, h, n]
        anagram();//not  anagram
        panagram();//not  panagram
        System.out.println(firstnonrepeating());//a
        System.out.println(checksubset());//true
    }
    
}
