package Variable_and_Datatype;
import java.util.Scanner;
public class input_in_java {
   
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.print(input);

        String name  =  sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);  
        
        float price = sc.nextFloat();
        System.out.println(price);

        double decimalNumber = sc.nextDouble();
        System.out.println(decimalNumber);

        long integer = sc.nextLong();
        System.out.println(integer);
        
        short n = sc.nextShort();
        System.out.println(n);

        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        byte b = sc.nextByte();
        System.out.println(b);
    }
}
