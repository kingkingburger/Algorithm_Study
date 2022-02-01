package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class N_1918 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charsArray = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();


        map.put('(', 0);
        map.put(')', 0);
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);

        char x;
        for (int i = 0; i < charsArray.length; i++) {

            x = charsArray[i];

            //x가 연산자인 경우
            if ( x < 'A') {

                if (x == '(' ) {

                    stack.push(x);

                } else if ( x == '+' || x == '-' || x == '*' || x == '/' ) {

                    while ( !stack.empty() && ( map.get(x) <= map.get( stack.peek()) )  ) {
                        sb.append( stack.pop() );

                    }
                    stack.push(x);

                }
                else {

                    while ( stack.peek() != '(' ) {
                        sb.append( stack.pop() );
                    }
                    stack.pop();
                }
            } else {
                sb.append( x );
            }

        }

        while ( !stack.empty() ){
            sb.append( stack.pop() );
        }
        System.out.println( sb );

    }
}