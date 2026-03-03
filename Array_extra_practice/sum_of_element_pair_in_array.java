package Array_extra_practice;

public class sum_of_element_pair_in_array {
    public static void main(String abc[]){
        int arr[] = {1,2,3,4,5};
        for(int i =0;i<arr.length;i++){
            int first = arr[i];
            for(int j =i+1;j<arr.length;j++){
                int second = arr[j];
                System.out.print(first+second+" ");
            }
            System.out.println();
        }
    }
}
