

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = 1;
        int range = 2;

        if (N == 1) {
            System.out.print(1);
        } else {

            while (range <= N) {
                range = range + (6 * cnt);
                cnt++;

            } // while

            System.out.print(cnt);
        } // if-else

    } // main

} // end class
