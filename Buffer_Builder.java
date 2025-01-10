public class Buffer_Builder 
{

    public  static  void strbuffers()
    {
        StringBuffer s=  new  StringBuffer("darshan");
        s.append("hanuman");
        s.insert(1, "good morning");
        s.replace(1, 2, "shraddha");
        System.out.println(s);//uman
        System.out.println(s.delete(1, 1));//dshraddhaood morningarshanhanuman
        System.out.println(s);//dshraddhaood morningarshanhanuma
        System.out.println(s.reverse());//namunahnahsragninrom dooahddarhsd
        System.out.println(s.capacity());//48
    }

    public  static  void strbuilders()
    {
        System.out.println("  string  builders :");
        StringBuilder sb= new StringBuilder("jaga");
        sb.append("viraj");
        System.out.println(sb);//jagaviraj
        System.out.println(sb.toString());//jagaviraj
        StringBuilder str1=  new StringBuilder(10);
        System.out.println(str1.capacity());//10
    }




    public static void main(String[] args) 
    {
        strbuffers();
        strbuilders();
        
    }
    
}
