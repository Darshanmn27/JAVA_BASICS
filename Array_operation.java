import java.util.Arrays;

public class Array_operation 
{



    public   static   void   print_arrayelements()
    {


        int arr[]={10,29,38,48,57,67};
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println(" ");
    }



    public   static  void   descending_order()
    {
        System.out.println("  descending order  of  the  elements  in  a  given  array");
        int arr[]={1,2,3,90,899,7161,131,12,1,2,3,34};
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[j]>arr[i])
                {
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }




    public   static   void   even_array()
    {
        System.out.println("  even  array elementsm : ");
        int arr[]={10,20,30,40,506,19,11,13,13,69};
        for(int num:arr)
        {
            if(num%2==0)
        
            {
                System.out.print(num+" ");
            }
        }
    }
    public   static   void   odd_array()
    {
        System.out.println("  odd array elementsm : ");
        int arr[]={10,20,30,40,506,19,11,13,13,69};
        for(int num:arr)
        {
            if(num%2!=0)
        
            {
                System.out.print(num+" ");
            }
        }
    }


    public static void addelemtarrar()
    {
        System.out.println("code..addelemenets");
        int a[]={1,90,87,67,54,34};
        int ele=2027;
        int index=3;
        int l=a.length;
        int nar[]=new int[l+1];
        for(int i=0;i<index;i++)
        {
            nar[i]=a[i];
            //System.out.print(nar[i]+" ");
        }
        nar[index]=ele;
        for(int i=index;i<l;i++)
        {
            nar[i+1]=a[i];
        }
        for(int i=0;i<nar.length;i++)
        {
            System.out.print(nar[i]+" ");
        }
       
    }


    public static void delete()
{
    System.out.println(" \n code delete...");
    int ar[]={10,29,27,37,14};
    int del =37;
    int l=ar.length;
    for(int i=0;i<l-1;i++)
    {
        if(ar[i]==del)
        {
            for(int j=i;j<l-1;j++)
            {
                ar[j]=ar[j+1];
            }
            l--;
            break;
        }
    }
    for(int p=0;p<ar.length-1;p++)
    {
System.out.print(ar[p]+" ");
    }
}


public static void max()
{
    System.out.println("  maximum  num  in   given  array:");
    int arr[]={10,20,30,9,8,7,6,54,32};
    int max=arr[0];
    for(int num:arr)
    {
        if(num>max)
        {
            max=num;
        }
    }
    System.out.println(max);

}
public static void minimum_array()
    {
        System.out.println("  minimum  num  in   given  array:");
        int arr[]={10,20,30,9,8,7,6,54,32};
        int min=arr[0];
        for(int num:arr)
        {
            if(num<min)
            {
                min=num;
            }
        }
        System.out.println(min);

    }

    public  static int  linear_search()
    {
        System.out.println("\n linear  search :");
        int arr[]={91,82,73,46,99,1,12,23,34,567,89};
        int k=99;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }


    public static  void ascendingcharacter()
    {
        System.out.println("\n  ascending order: ");
        String ss="darshan";
        char ch1[]= ss.toCharArray();
        Arrays.sort(ch1);
        for(char ch:ch1)
        {
            System.out.print(ch+" ");
        }
        System.out.println();
    }


    public static void searchin2_dimension()
    {
        int tar=3;
        int arr[][]={{1,2,3},
                     {4,5,6},
                      {7,8,9}};
 for(int i=0;i<arr.length;i++)
 {
    for(int j=0;j<arr.length;j++)
    {
        if(tar==arr[i][j])
        {
            System.out.print("{"+i+","+j+"}");
        }
    }
 }
    }

    public static void minimum_maximum_2d_array()
    {
        System.out.println("  maximum  in 2d  array:");
        int arr[][]={{1,2,3},
        {4,5,6},
         {7,8,9}};
         int max=arr[0][0];
         int min=arr[0][0];
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr.length;j++)
    {
        if(arr[i][j]>max)
        {
            max=arr[i][j];
        }
        if(arr[i][j]<min)
        {
            min=arr[i][j];
        }

    }

}
System.out.println(max);
System.out.println(" minimum :");
System.out.println(min);
    }

    public static void main(String[] args) 
    {
        print_arrayelements();//10 29 38 48 57 67 
        descending_order();//7161 899 131 90 34 12 3 3 2 2 1 1
        even_array();//10 20 30 40 506
        odd_array();//19 11 13 13 69
        addelemtarrar();//1 90 87 2027 67 54 34
        delete();//10 29 27 14
        max();//54
        minimum_array();//6
        System.out.println(linear_search());//4
        ascendingcharacter();//a a d h n r s
        searchin2_dimension();//{0,2}
        minimum_maximum_2d_array();//min=1  max=9
        
    }
}
