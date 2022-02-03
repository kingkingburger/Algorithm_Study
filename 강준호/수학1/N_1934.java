package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1934 {

    static int calculator(int x, int y ) {

        int z = 2;
        int result = 1;
        while ( z <= x && z <= y ) {

            if ( x % z == 0 && y % z == 0) {

                x = x / z;
                y = y / z;
                result = result * z;
                z=2;
            }
            else {
                z++;
            }
        }
        return result * x * y;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for ( int i = 0 ; i < num ; i++  ) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt( st.nextToken() );
            int y = Integer.parseInt( st.nextToken() );
            sb.append( calculator(x ,y) + "\n" );
        }
        System.out.println(sb);

    }
}
