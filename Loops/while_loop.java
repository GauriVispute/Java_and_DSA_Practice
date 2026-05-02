package Loops;

public class while_loop {
    public static void main(String[] args) {
        int counter =0 ;
        while(counter<100000){
            System.out.println(counter+" Hello World");
            counter++;
        }

        System.out.println("------- Printed HW "+counter+"x -------");


        /*
            -- Infinite Loop -- 
            while(true){
            System.out.println(counter+" Hello World");
            counter++;
        }

        -- Unreachable code --
        System.out.println("------- Printed HW "+counter+"x -------");
        */
    }
}
