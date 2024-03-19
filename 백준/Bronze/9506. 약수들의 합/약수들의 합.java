


import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        while(true) {

            int n = sc.nextInt();

            if(n == -1) {
                break;
            } // if

            int cnt = 0; // 약수의 갯수를 저장

            for(int i = 1; i<=n; i++) {

                if(n % i == 0) {
                    cnt++;
                } // if

            } // for

            int[] arr = new int[cnt];  // N의 약수를 넣을 배열
            int num = 0; // 배열에 약수를 저장할 때 사용

            for(int i = 1; i<=n; i++) {

                if(n % i == 0) {
                    arr[num] = i;
                    num++; // 약수를 배열에 저장할 때마다 증가

                } // if

            } // for

            int sum = 0;
            for(int i = 0; i<arr.length-1; i++) {
                sum += arr[i];
            } // for

            if(n == sum) {
                System.out.print(n + " = " + arr[0]);

                for(int i = 1; i<arr.length-1; i++) {
                    System.out.print(" + " + arr[i]);

                } // for
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            } // if-else

        } // while


    } // main

} // end class
