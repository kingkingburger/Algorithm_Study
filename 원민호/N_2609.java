import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] Num = br.readLine().split(" ");
        int num1 = Integer.parseInt(Num[0]);
        int num2 = Integer.parseInt(Num[1]);

        //num1이 항상 num1보다 크게
        if(num1 < num2){
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        //최대공약수 - 유클리드 호제법(num2의 나머지가 0보다 크면 나머지를 나누기)
        //1. a = 10, b = 8, 나머지 2 => a = 8, b = 2
        //2. a = 8, b = 2, 나머지 0 => a = 2, b = 0
        //최대공약수
        for(int i = num1; i > 0; i--){
            if((num1 % i) == 0 && (num2 % i) == 0 ){
                System.out.println(i);
                System.out.println(result / i);
                break;
            }
        }

    }
}
