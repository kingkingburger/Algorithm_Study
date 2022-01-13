package Number;

import java.io.IOException;
import java.io.*;
import java.util.Stack;

public class N_1406 {


    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Character> stack1 = new Stack<>(); //편집되기 전의 문자열
        Stack<Character> stack2 = new Stack<>(); //편진된 후의 문자열

        String text = br.readLine(); //문자열 입력

        for ( int i = 0 ; i < text.length() ; i++) {

            stack1.push( text.charAt(i) );
        }

        int count = Integer.parseInt(br.readLine());

        String control;
        /*
        L은 커서를 왼쪽으로 한 칸 옮김
        D는 커서를 오른쪽으로 한 칸 옮김
        B는 커서 왼쪽에 있는 문자를 삭제함
        else는 특정 문자를 커서 왼쪽에 추가함
         */
        for ( int i = 0 ; i < count ; i++ ) {

            control = br.readLine();

            if ( control.charAt(0) == 'L') {

                if ( !stack1.empty())
                    stack2.push( stack1.pop() );

            } else if ( control.charAt(0) == 'D' ) {
                if( !stack2.empty() )
                    stack1.push( stack2.pop() );

            } else if ( control.charAt(0) == 'B' ) {

                if ( !stack1.empty() ) {
                    stack1.pop();
                }

            } else {

                stack1.push( control.charAt(2));
            }
        }
        while ( !stack1.empty() ) {
            stack2.push(stack1.pop());
        }
        while ( !stack2.empty()) {
            bw.write(stack2.pop());
        }
        bw.flush();
        bw.close();

    }
}
