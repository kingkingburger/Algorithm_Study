package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class N_10866 {

    public static void main(String[] args) throws IOException {


        ArrayDeque<Integer> deck = new ArrayDeque<>();
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();


        int command = Integer.parseInt( reader.readLine() );
        String input;
        String[] inputList;
        for (int i = 0 ; i < command ; i++) {

            input = reader.readLine();
            inputList = input.split(" ");

            if ( inputList[0].equals("push_front") ) {

                deck.addFirst( Integer.parseInt( inputList[1]) );

            }
            else if ( inputList[0].equals("push_back") ) {

                deck.add(Integer.parseInt( inputList[1]));

            }
            else if ( inputList[0].equals("pop_front") ) {

                if ( !deck.isEmpty() ) {
                    stringBuilder.append( deck.removeFirst()+ "\n");
                }
                else {
                    stringBuilder.append( -1 + "\n");
                }

            }
            else if ( inputList[0].equals("pop_back") ) {

                if ( !deck.isEmpty() ) {
                    stringBuilder.append(deck.removeLast()+ "\n");
                }
                else {
                    stringBuilder.append( -1 + "\n");
                }
            }
            else if ( inputList[0].equals("size") ) {

                stringBuilder.append(deck.size()+ "\n");

            }
            else if ( inputList[0].equals("empty") ) {


                if ( !deck.isEmpty() ) {
                    stringBuilder.append( 0 + "\n");
                }
                else {
                    stringBuilder.append(1 + "\n");
                }

            }
            else if ( inputList[0].equals("front") ) {

                if ( !deck.isEmpty()) {

                    stringBuilder.append( deck.getFirst() + "\n" );
                }
                else {
                    stringBuilder.append(-1 + "\n");
                }

            }
            else if ( inputList[0].equals("back") ) {

                if ( !deck.isEmpty()) {
                    stringBuilder.append(  deck.getLast( ) + "\n" );
                } else {
                    stringBuilder.append(-1 + "\n");
                }


            }

        }
        System.out.println( stringBuilder );


    }

}
