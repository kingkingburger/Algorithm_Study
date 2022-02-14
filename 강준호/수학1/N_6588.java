package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_6588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();



        boolean[] array = new boolean [ 1000000 + 1 ];
        array[1] = true;

        for ( int i = 2 ; i <= (int) Math.sqrt(1000000) ; i++ ) {

            if (array[i]) {
                continue;
            }

            for ( int j = i * i; j <= 1000000; j+=i ) {

                array[j] = true;

            }
        }
        //3 5  7 11  12
        int input = Integer.parseInt( br.readLine());

        while ( input !=0 ) {

            for (int i = 3; i <= input / 2; i++) {

                //array[i] + array[ input - 1 ] = input
                if ( !array[i] && !array[ input - i ]  ) {
                    sb.append( input + " = " + i + " + " + (input - i) + "\n");
                    break;
                }

            }

            input = Integer.parseInt( br.readLine() );
        }
        System.out.print(sb);

    }
}
