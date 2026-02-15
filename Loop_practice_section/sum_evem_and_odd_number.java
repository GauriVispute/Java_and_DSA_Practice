package Loop_practice_section;
import java.util.*;
public class sum_evem_and_odd_number {
    public static void main(String[] args) {
       
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to take input : ");
        int n = sc.nextInt();

        int odd=0,even=0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter number : ");
            int number  = sc.nextInt();
            
            if(number%2==1){ //odd
                odd += number;
            }else{ // even
                even += number;
            }
            
        }
        System.out.println("Odd sum : "+odd+"\nEven sum : "+even);

    }
}
