package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class N_1935 {

    public static void main(String[] args) throws IOException {

        Stack<Double> stack = new Stack<>();
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        Integer.parseInt(br.readLine());
        char[] array = (br.readLine()).toCharArray(); // 식
        Map<Character, Integer> map = new HashMap<>(); //key: 변수, value: 변수 값


        char x;
        for ( int i = 0 ; i < array.length; i++ ) {
            x = array[i];
            //x가 연산자이고 map에 key 존재유무 검사
            if ( x >= 'A' && !map.containsKey(x) ) {
                map.put(x, Integer.parseInt( br.readLine() ) );
            }
        }

        double num1;
        double num2;

        for ( int i = 0 ; i < array.length ; i++ ) {

            x = array[i];
            if ( x == '+' || x == '-'
                    || x == '*' || x== '/' ) {

                num1 = stack.pop();
                num2 = stack.pop();

                if (x == '+') {
                    stack.push( num2 + num1);
                } else if ( x == '-' ) {
                    stack.push( num2 - num1);
                } else if ( x == '*' ) {
                    stack.push( num2 * num1);
                } else {
                    stack.push( num2 / num1);
                }

            }
            else {
                stack.push( (double) map.get(x) );
            }

        }

        System.out.println( String.format("%.2f", stack.pop()) );

        /*
        1. 스택에 알파뱃 넣기
        2. 연산자를 만나면 스택에서 2개 빼기
        3. 계산 결과를 다시 스택에 넣기
         */

    }
}
