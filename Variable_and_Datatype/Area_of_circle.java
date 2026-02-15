package Variable_and_Datatype;

import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();

        float area = 3.14f* r*r;
        System.out.println(area);
    }
}
