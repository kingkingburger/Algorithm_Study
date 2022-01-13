package Number;

import java.util.Scanner;
import java.util.Stack;


public class N_1874 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int Max = sc.nextInt();
        int[] array = new int[ Max ];
        StringBuilder sb = new StringBuilder();

        for ( int arrayLocation  = 0; arrayLocation  < Max ; arrayLocation ++)  {
            array[arrayLocation ] = sc.nextInt();
        }

        int arrayLocation = 0;
        for ( int number = 1 ; number <= Max ; number++ ) {

            stack.push(number);
            sb.append('+' + "\n");
            //while 문에서 else인 경우는 오류, 제대로된 입력이였다면 if나 else if로 간다.
            while (  !stack.empty()  ) {

                //push를 더 해야하는 상황
                if ( array[arrayLocation] > stack.peek() ) {

                    break;

                }
                //pop을 해야하는 상황
                else if (array[arrayLocation] == stack.peek()) {

                    stack.pop();
                    sb.append('-' + "\n");
                    arrayLocation++;

                } else {
                    System.out.println("NO");
                    return;
                }
            }

        }
        System.out.print(sb);


    }


}
