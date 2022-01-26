package Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_10808 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabetArray = new int[26];
        char[] input = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        //97=A
        for (int i = 0; i < input.length ; i++) {
            alphabetArray[ input[i]-97 ]++;
        }
        for (int i = 0; i < alphabetArray.length ; i++) {
            sb.append(alphabetArray[i] + " ");
        }

        System.out.println(sb);

    }
}
