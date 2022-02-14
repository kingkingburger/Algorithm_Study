package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1978 {

    public static void main(String[] args) throws IOException  {

        //소수 구하기?
        /*
        1. 입력값에 제곱근을 구하여 2부터 제곱근 까지 그 수가 나뉘는지 검사한다.
        2. 나뉜다면 아닌것
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt( br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = input;

        for (int i = 0; i < input ; i++) {

            int x = Integer.parseInt(st.nextToken());
            int sqrt = (int) Math.sqrt(x);

            for (int j = 2; j <= sqrt; j++) {

                if( x % j == 0) {
                    count--;
                    break;
                }

            }

            if( x == 1) {
                count--;
            }

        }
        System.out.println(count);
    }

}
