package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_2609 {

    int LeastCommonMultiple;
    int greatestCommonMultiple;

    void calculator(int x, int y ) {

        int z = 2;
        LeastCommonMultiple = 1;
        while ( z <= x && z <= y ) {

            if ( x % z == 0 && y % z == 0) {

                x = x / z;
                y = y / z;
                LeastCommonMultiple = LeastCommonMultiple * z;
                z=2;
            }
          else {
              z++;
            }
        }
        greatestCommonMultiple = LeastCommonMultiple * x * y;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        N_2609 n_2609 = new N_2609();
        n_2609.calculator(A, B);

        System.out.println(n_2609.LeastCommonMultiple + "\n" + n_2609.greatestCommonMultiple);


    }

}
