package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N_17299 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt( br.readLine() );
        int[] countArray = new int[1000001];
        int[] array = new int[size];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer( br.readLine() );

        int location = 0;
        while ( st.hasMoreTokens() ) {
            array[ location++] = Integer.parseInt( st.nextToken() );
        }

        for ( int i = 0 ; i < size ;i++ ) {
            countArray[ array[i] ]++;
        }

        while (location < size) {
            sb.append( array[location++] + " ");
        }
        stack.push(0);
        int arrayNum;
        for ( location = 1 ; location < size ; location++) {
            arrayNum =  countArray[ array[ location ] ];
            while ( true ) {
                if (  arrayNum > countArray[ array[stack.peek()] ] ) {
                    array[stack.pop()] =  array[ location ];
                    if ( stack.empty() ){
                        stack.push(  location );
                        break;
                    }

                } else {
                    stack.push( location );
                    break;
                }
            }

        }

        while ( !stack.empty() ) {
            array[stack.pop()] = -1;
        }

        location = 0;
        while (location < size) {
            sb.append( array[location++] + " ");
        }
        System.out.println( sb );

    }
}
