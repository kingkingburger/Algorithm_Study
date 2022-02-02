package Number;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] array = new int[3];
        int location = 0;
        while (st.hasMoreTokens()) {
            array[location++] = Integer.parseInt( st.nextToken() );
        }
        sb.append( (array[0] + array[1])%array[2] + "\n" +
                ((array[0] % array[2]) + (array[1] % array[2]))%array[2] + "\n" +
                (array[0] * array[1])%array[2] + "\n" +
                ((array[0]%array[2])* (array[1] % array[2]))%array[2]);
        System.out.println(sb);
    }




}


