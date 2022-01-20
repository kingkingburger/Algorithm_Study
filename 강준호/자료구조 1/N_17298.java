package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N_17298 {

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int Size = Integer.parseInt(br.readLine());
        int []array = new int[Size];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int location = 0;
        while( st.hasMoreTokens() ) {
            array[location++] = Integer.parseInt( st.nextToken() );
        }

        stack.push(0);
        int arrayNum;
        for ( location = 1 ; location < Size ; location++) {
            arrayNum =  array[ location ];
            while ( true ) {
                if (  arrayNum > array[stack.peek()]) {
                    array[stack.pop()] =  arrayNum;
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
        for ( location = 0; location < Size ; location++) {
            sb.append( array[location] + " ");
        }
        System.out.println(sb);

        /*
        1. 배열과 스택을 이용한다.
        2. 배열은 입력받은 수를 저장하고 있다.
        3. 스택은 오큰수를 구하지 못한 인덱스를 저장한다. (즉 작은 수)
        4. 배열의 앞에서 부터 오큰수와 비교한다.
        5. 오큰수를 구하면 스택을 pop하며 pop한 인덱스 값의 배열값을 오큰수로 채워 넣는다.
        6. 끝까지 배열을 돌았는데 스택에 남아있는 값이 있다면 그것은
         */


    }


}