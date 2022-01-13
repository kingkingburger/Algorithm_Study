package Number;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N_1158 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();

        String input = reader.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt( st.nextToken() );
        int K = Integer.parseInt( st.nextToken() );


        for ( int i = 1 ; i <= N ; i++ ) {
            list.add(i);
       }
        int location = 0;
        sb.append('<');
        for ( int i = N ; 0 < i ; i-- ) {

            location = ( location + K - 1 ) % i ;
            sb.append( list.get(location ) + ", " );
            list.remove(location );


        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);


    }
}
