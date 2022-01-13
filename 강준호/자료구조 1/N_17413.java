package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class N_17413 {

    public static void main(String[] args ) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list = new LinkedList<Character>();
        StringBuilder sb = new StringBuilder();
        String input = reader.readLine();
        int i = 0;
        while ( i < input.length() ) {

            if ( input.charAt(i) == '<') {

                while ( input.charAt(i) != '>') {

                    sb.append(input.charAt(i++));

                }
                sb.append('>');
                i++;
            }
            else {
                char x = input.charAt(i);
                while ( input.charAt(i) != '<' && input.charAt(i) != ' ' ) {

                    list.addLast( input.charAt(i++) );
                    if (  i >= input.length() ) {
                        break;
                    }
                }
                int size = list.size();
                while( size-- > 0) {

                    sb.append( list.removeLast() );

                }
                if ( i < input.length() && input.charAt(i) == ' ') {
                    sb.append(' ');
                    i++;
                }
            }
        }
        System.out.println(sb);
    }

}
