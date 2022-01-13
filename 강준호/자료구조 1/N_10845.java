package Number;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N_10845 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine( );
        String control;
        StringBuilder sb = new StringBuilder();
        int back = 0;

        for ( int i = 0 ; i < count; i++ ) {

            control = sc.next( );

            if ( control.equals("push")) {
                back = sc.nextInt();
                queue.add( back );

            }
            else if ( control.equals("pop")) {

                if (! queue.isEmpty()) {
                    sb.append(queue.remove() + "\n");

                } else {
                    sb.append(-1 + "\n");

                }
            }
            else if ( control.equals("size")) {

                sb.append(queue.size() + "\n");

            }
            else if ( control.equals("empty")) {

                if ( !queue.isEmpty()) {
                    sb.append( 0 + "\n" );
                } else {
                    sb.append( 1 + "\n");

                }

            }
            else if ( control.equals("front")) {
                if ( !queue.isEmpty()) {
                    sb.append( queue.peek() + "\n" );
                } else {
                    sb.append(-1 + "\n" );

                }
            }
            else if ( control.equals("back") ) {

                if ( !queue.isEmpty()) {
                    sb.append( back + "\n" );
                } else {
                    sb.append(-1 + "\n" );

                }

            }

        }
        System.out.println(sb);




    }


}
