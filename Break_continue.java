public class Break_continue 
{

    public  static  void jump()
    {
        System.out.println(" jump");
        int a=20;
        for(int i=0;i<=a;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.print(i+" ");//1 3 5 7 9 11 13 15 17 19
        }
    }


    public  static  void brea()
    {
        System.out.println("break statement");
        int a=20;
        for(int i=0;i<=a;i++)
        {
            if(i>10)
            {
                break;
            }
            System.out.print(i+"  ");//0  1  2  3  4  5  6  7  8  9 10
        }
    }



    public static void main(String[] args) 
    {
        jump();
        brea();
        
    }
    
}
