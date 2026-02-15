package variable_extra_practice;
public class lower_left_triangle {
     public static void main(String[] args) {
    //     int n  = 5;
        
    //     for(int r =1;r<=n;r++){
    //         for(int c =1;c<=r;c++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    int n  = 5;
        
        for(int r =1;r<=n;r++){
            for(int c =1;c<=n;c++){
                if(c<=r){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
