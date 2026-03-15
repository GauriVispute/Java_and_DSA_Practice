package Variable_and_Datatype;

public class Type_promotion_in_expression {
    public static void main(String [] args){

        // 1st point 
        // case 1

        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) a);
        // System.out.println((int) b);
        // System.out.println(b-a);

        // case 2 :

        // short a= 5;
        // byte b  = 25;
        // char c  = 'c';
        // byte bt  = (byte) (a+b+c);
        // System.out.println(bt);

        // ---------------------------------------
        // 2nd point 
        // case 1 :

        // int a  = 10;
        // float b  = 20.25f;
        // long c = 25;
        // double d  = 30;

        // double  ans1 = a+b+c+d;
        // System.out.println(ans1);
        

        // type conversion in expression
        byte b = 5;
        byte a = (byte)(b*2);
        System.out.println(a);



    }

}
