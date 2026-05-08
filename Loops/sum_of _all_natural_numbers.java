import java.util.Scanner;


public class sum_of_all_natural_numbers{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		int counter = 1;
		int sum =0;
		while(counter<=n){
			sum= sum+counter;
			counter++;
		}
		
		System.out.println("Sum : "+sum);
  }
}
