public class Ascii_conversion 
{


    public static  void asc()
    {
       
        System.out.println("\n"+"lower case ascii");
        for( int i='a';i<='z'&&i<='z';i++)
        {
            System.out.print(i+" ");//97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122
        }
        System.out.println();
        System.out.println("upper case ascii");
        for( int i='A';i<='Z';i++)
        {
            System.out.print(i+" ");//65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 
        }

        System.out.println();
        System.out.println("\n"+"lower case ascii");
        for( char i='a';i<='z'&&i<='z';i++)
        {
            System.out.print(i+" ");//a b c d e f g h i j k l m n o p q r s t u v w x y z
        }
        System.out.println();
        System.out.println("upper case ascii");
        for( char i='A';i<='Z';i++)
        {
            System.out.print(i+" ");//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        }
        System.out.println();
    
    }
    public static void numbertochar()
    {
        System.out.println();
        for(int a=48;a<128;a++)
        {
            System.out.print((char)a+" ");//0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z { | } ~
        }
    }

    public static void main(String[] args) 
    {
        asc();
        numbertochar();



        
    }
    
}
