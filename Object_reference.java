public class Object_reference 
{

    public  static  void equal()
    {
        //==  poperator  for  refrences     comaprision  both  objects   and  parameters 
        // .equals()  method for  content comapsion  and  used  only  for  objects
        String  s1="darshan";
         String  s2="darshan";
         String  s3=new  String("darshan");
         System.out.println(s1==s2);//true
         System.out.println(s1==s3);//false
         System.out.println(s1.equals(s2));//true
         System.out.println(s1.equals(s2));//true
    }
 
    


    public static void main(String[] args) 
    {
        equal();
        
    }
}
