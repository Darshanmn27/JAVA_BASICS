package Inheritance;

public class Reverse_words_instring 
{



    public   static  String rev(String ss)
    {
      String res="";
      if(ss==null ||ss.length()==0)
      {
        return "";
      }
      for(int i=ss.length()-1;i>=0;i--)
      {
        res=res+ss.charAt(i);
      }
      return res;
    
    }
    public   static   void   reversewordsinastring()
    {
      String ss=" Good Morning";
    // System.out.println(rev(ss));
     String words[]=ss.split(" ");
     String res="";
     for(String w:words)
     {
      res=res+rev(w)+" ";
     }
     //System.out.println("   reverse   words   in a string");
     System.out.println(res);
    }



    public static void main(String[] args) 
    {
        System.out.println(rev("darshan"));//nahsrad
        reversewordsinastring();// dooG gninroM 
        
    }
    
}
