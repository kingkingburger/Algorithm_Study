package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        boolean[] array = new boolean [ y + 1];
        array[1] = true;

        for (int i = 2; i <=  (int) Math.sqrt(y) ; i++) {
            if ( array[i] ) continue;
            for ( int j = i * i ; j <= y ; j+=i ) {
                array[j] = true;
            }
        }
        for (int i = x ; i <= y; i++) {
            if( !array[i] )
                sb.append(i + "\n");
        }
        System.out.print(sb);


    }

}
