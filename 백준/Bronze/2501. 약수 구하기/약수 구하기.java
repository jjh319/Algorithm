


import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0; // 약수의 갯수를 저장

        for(int i = 1; i<=N; i++) {

            if(N % i == 0) {
                cnt++;
            } // if

        } // for

        int[] arr = new int[cnt];  // N의 약수를 넣을 배열
        int num = 0; // 배열에 약수를 저장할 때 사용

        if(cnt < K) {
            System.out.println(0);
            return;
        } // if

        for(int i = 1; i<=N; i++) {

            if(N % i == 0) {
                arr[num] = i;
                num++; // 약수를 배열에 저장할 때마다 증가

            } // if

        } // for

        System.out.println(arr[K-1]);

    } // main

} // end class
