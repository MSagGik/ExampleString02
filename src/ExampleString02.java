import java.util.Scanner;

public class ExampleString02 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            int num1 = (num / 100000);
            int num2 = (num / 10000) - (num / 100000) * 10;
            int num3 = (num / 1000) - (num / 10000) * 10;
            int num4 = (num / 100) - (num / 1000) * 10;
            int num5 = (num / 10) - (num / 100) * 10;
            int num6 = (num) - (num / 10) * 10;

            int numa = num1 +num2 + num3;
            int numb = num4 +num5 + num6;

            int nums = numa - numb;
            int i = num4*100+num5*10+num6+nums;
            int a = num1*100000+num2*10000+num3*1000+i;
            System.out.println(a);

            sc.close();
        }
    }
