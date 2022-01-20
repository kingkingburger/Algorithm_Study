package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class N_10799 {

    public static void main(String[] args) throws IOException {
    /*
        Stack<Integer> stack = new Stack<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char present;
        char before = ' ';
        int laserCount = 0;
        int stick = 0;
        int bracketCount = 0;

        for ( int i = 0 ; i < input.length() ; i++ ) {

            present = input.charAt(i);

            if ( present == '(') {
                bracketCount++;

                if ( before == '(' && bracketCount > 0 ) {

                    if ( laserCount > 0 ) {
                        stack.push(laserCount);
                        laserCount = 0;
                    }
                }
            }

            else if ( present == ')') {
                bracketCount--;

                if ( before == '(' && bracketCount >0) {

                    laserCount++;
                }

                else if (  before == ')' ) {
                    stick += laserCount + 1;
                    if ( !stack.empty()) {
                        laserCount = stack.pop() + laserCount;
                    }
                }

            }

            before = present;
        }
        System.out.println( stick );
    */
        LinkedList<Character> list = new LinkedList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] chars = input.toCharArray();
        int stickCount = 0;
        int openParentheses = 0;
        int closeParentheses = 0;
        int stickTotal = 0;
        char parentheses; //괄호
        for ( int i = 0 ; i < chars.length ; i ++) {

            list.addLast(chars[i]);
            if( input.charAt(i) == '(') {
                openParentheses++;
            } else {
                closeParentheses++;
            }

            if ( openParentheses == closeParentheses) {
                while (!list.isEmpty()) {
                    parentheses = list.removeFirst();

                    if (parentheses == '(') {
                        stickCount++;

                        if (list.getFirst() == ')') {
                            stickCount--;
                            stickTotal += stickCount;
                        } else {
                            stickTotal += 1;
                        }
                    } else {

                        if ( !list.isEmpty() && list.getFirst() == ')' ) {
                            stickCount--;
                        }
                    }

                }
            }
        }
        System.out.println(stickTotal);

    }


}



