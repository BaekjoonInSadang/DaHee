package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *  빈도 정렬
 *
 *  1. 숫자를 자주 등장하는 순
 *  2. 빈도가 같다면 먼저 낭노 것이 앞에 있어야 함
 *
 */
public class b2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0 ; i< N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


    }
}
