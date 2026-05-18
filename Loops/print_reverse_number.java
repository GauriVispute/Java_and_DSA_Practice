 package Loops;

public class print_reverse_number{
	public static void main(String[] args) {
		int n =10899,reverse=0;
		while(n >0){
			
			int lastDigit= n%10;
			System.out.print(lastDigit+" ")
			n/=10;
		}
	
	}
}