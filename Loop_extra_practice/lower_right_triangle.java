package Loop_extra_practice;

public class lower_right_triangle {
    public static void main(String abc[]){
        int n=5;

        for(int r =1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if(c+r<=2*n && c+r>n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
