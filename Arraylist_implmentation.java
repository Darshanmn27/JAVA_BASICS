import  java.util.*;



class Arraylist
{
    private  int [] data;
    private  int size;
    public   Arraylist()
    {
        data=  new int[5];
        size=0;
    }
    public   void  add(int index,int element)
    {
        if(index<0||index>size)
        {
            throw  new IndexOutOfBoundsException("index  out  of  range");

        }
        ensurecapacity();
        for(int i=size;i>index;i--)
        {
            data[i]=data[i-1];
        }
        data[index]=element;
        size++;


    }
        private  void  ensurecapacity()
        {
            if(size==data.length)
        
            {
                int [] newdata=  new int[data.length*2];
                System.arraycopy(data, 0, newdata, 0, data.length);
                data=newdata;
            }
    }
    public   void  display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public  int get(int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("INdex  out  of  bound  exception");
        }
        return data[index];
    }

    public   void  set(int index,int  element)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("  occurs  an  index  ou  range");

        }
        data[index]=element;
    }

    public   void  remove(int index)
    {
        if(index<0 ||  index>=size)
        {
            throw new IndexOutOfBoundsException(" index  out  of  bound");
        }
        for(int i=index ;i<size-1;i++)
        {
            data[i]=data[i+1];
        }
        size--;
    }


    public  void  remove_element(int element)
    {
        int index=findIndex(element);
        if(index!=-1)
        {
            remove(index);
        }
       
    }
    public  int findIndex(int element)
    {
        for(int i=0;i<size;i++)
        {
            if(data[i]==element)
            {
                return  i;
            }
        }
        return -1;
    }
}

public class Arraylist_implmentation 
{



    public static void main(String[] args)
     {
        Arraylist  ll =  new Arraylist();
        ll.add(0,9181);
        ll.add(1,2027);
        ll.add(2,2023);
        ll.display();
        System.out.println("  getting  element  in  a  array  :");
      System.out.println(ll.get(2));
      ll.set(0, 97400);
      ll.display();
      System.out.println(ll.get(0));
      ll.remove(0);
      ll.display();
      ll.add(2, 918171);
      System.out.println(ll.findIndex(91871));
      ll.remove(0);
      ll.remove_element(918171);
      ll.remove(0);
      System.out.println("  remaining   elements  are :");
      ll.add(0, 91817171);
      ll.display();
        
    }
    
}
/*




1. **Arraylist Class**:
    - **Fields**:
        - `data`: An array that stores the elements.
        - `size`: The current number of elements in the array.

    - **Constructor**: Initializes the `data` array with a default capacity of 5 and sets the initial `size` to 0.

    - **add Method**: Inserts an element at a specific index. 
        - First, it checks if the index is valid. 
        - Then, it calls `ensurecapacity` to make sure there's enough space in the array.
        - It shifts elements to the right to make space for the new element.
        - Finally, it inserts the element and increments the `size`.

    - **ensurecapacity Method**: Checks if the array needs resizing. If it does, it creates a new array with double the capacity, copies the elements to the new array, and replaces the old array.

    - **display Method**: Prints the elements of the array.

    - **get Method**: Returns the element at a specified index with bounds checking.

    - **set Method**: Updates the element at a specified index with bounds checking.

    - **remove Method**: Removes an element at a specified index with bounds checking. It shifts elements to the left to fill the gap.

    - **remove_element Method**: Finds the index of a specified element and removes it.

    - **findIndex Method**: Finds the index of a specified element in the array.

2. **Adding_at_specific Class**:
    - This class is used to test the `Arraylist` implementation.
    - It creates an `Arraylist` object, adds elements, displays elements, gets and sets elements, removes elements, and prints the final state of the array.

### Edge Cases:

1. **Empty Array**: Ensure that methods like `get`, `remove`, and `set` handle cases where the array is empty.
2. **Full Array**: Ensure that `add` method correctly resizes the array when it reaches full capacity.
3. **Invalid Index**: Ensure that all methods handle cases where the index is out of bounds.

### Potential Optimizations:

1. **Dynamic Resizing**: While doubling the array size is effective, you could explore more advanced resizing strategies to optimize memory usage.
2. **Lazy Removal**: Instead of immediately shifting elements during removal, you could mark elements for removal and perform the shift operation in bulk during certain conditions.


*/
