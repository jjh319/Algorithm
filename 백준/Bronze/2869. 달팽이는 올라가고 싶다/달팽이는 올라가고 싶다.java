

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 올라가는 값
        int B = Integer.parseInt(st.nextToken()); // 내려가는 값
        int V = Integer.parseInt(st.nextToken()); // 목표값

        int cnt = 0;  // 걸린 일 수

        // 전체 높이(V)에서 마지막 날에 올라갈 수 있는 높이(A)를 빼고 시작
        // 이는 마지막 날에는 밤에 미끄러지지 않기 때문이다.
        int line = V - A;

        // 낮과 밤을 합친 순수익(A-B)으로 line 나누어 필요한 일수를 계산합니다.
        // 이 때, line이 0 이하라면 달팽이가 첫 날에 바로 정상에 도달할 수 있음을 의미합니다.
        if(line > 0) {
            cnt = line / (A - B);

            if(line % (A - B) != 0) {
                cnt++;
            } // if

        } // if

        // 마지막 날을 포함하여 총 필요한 일수를 하나 더 추가
        cnt++;

        System.out.println(cnt);
    } // main
} // end class
